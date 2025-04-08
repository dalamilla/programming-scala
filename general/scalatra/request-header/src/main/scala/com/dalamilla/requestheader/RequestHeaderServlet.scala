package com.dalamilla.requestheader

import org.json4s.{DefaultFormats, Formats}

import org.scalatra._
import org.scalatra.json._
import org.scalatra.ActionResult._

import com.dalamilla.requestheader.models.Whoami
import com.dalamilla.requestheader.models.Error

class RequestHeaderServlet extends ScalatraServlet with JacksonJsonSupport {
  protected implicit lazy val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
  }

  get("/api/whoami") {
    val ip = request.getRemoteAddr()
    val software = request.getHeader("user-agent")
    val language = request.getHeader("accept-language")

    Whoami(ip, language, software)
  }

  notFound {
    response.setStatus(404)
    Error("Not Found")
  }

}
