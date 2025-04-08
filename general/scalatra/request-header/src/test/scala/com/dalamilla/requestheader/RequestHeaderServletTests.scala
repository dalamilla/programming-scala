package com.dalamilla.requestheader

import org.scalatra.test.scalatest._

class RequestHeaderServletTests extends ScalatraFunSuite {

  addServlet(classOf[RequestHeaderServlet], "/*")

  test("GET / on RequestHeaderServlet should return status 404") {
    get("/") {
      status should equal(404)
    }
  }

  test("GET /api on RequestHeaderServlet should return status 404") {
    get("/api") {
      status should equal(404)
    }
  }

  test("GET /api/whoami on RequestHeaderServlet should return client info") {
    get("/api/whoami") {
      status should equal(200)
      body should include("Apache-HttpClient")
    }
  }

}
