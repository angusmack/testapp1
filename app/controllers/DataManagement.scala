package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models._
import views._

object DataManagement extends Controller {
    def index = Action { 
    	Ok(views.html.datamanagement.index("Data Management for Account ###"))    
  }
}