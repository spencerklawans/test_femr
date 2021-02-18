// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/spencerklawans/Documents/newfemr/conf/routes
// @DATE:Wed Feb 17 23:54:59 PST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package femr.ui.controllers {

  // @LINE:65
  class ReversePhotoController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def GetPatientPhoto(id:Integer, showDefault:Boolean = false): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "photo/patient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)) + play.core.routing.queryString(List(if(showDefault == false) None else Some(implicitly[play.api.mvc.QueryStringBindable[Boolean]].unbind("showDefault", showDefault)))))
    }
  
    // @LINE:66
    def GetPhoto(id:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "photo/encounter/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("id", id)))
    }
  
  }

  // @LINE:43
  class ReversePharmaciesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def editGet(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pharmacy/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:45
    def indexGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pharmacy")
    }
  
    // @LINE:46
    def indexPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "pharmacy")
    }
  
    // @LINE:44
    def editPost(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "pharmacy/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
  }

  // @LINE:5
  class ReverseApplicationController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def removeTrailingSlash(path:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[String]].unbind("path", path) + "/")
    }
  
  }

  // @LINE:48
  class ReverseHistoryController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def indexEncounterGet(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "history/encounter/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:49
    def updateEncounterPost(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "history/encounter/updateField/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:52
    def indexPatientGet(query:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "history/patient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("query", query)))
    }
  
    // @LINE:53
    def indexPatientGetWithRankedMatches(first:String, last:String, phone:String, addr:String, age:Long, gender:String, city:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "history/patient/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("first", first)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("last", last)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("phone", phone)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("addr", addr)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("age", age)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("gender", gender)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("city", city)))
    }
  
    // @LINE:50
    def listTabFieldHistoryGet(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "history/encounter/listTabFieldHistory/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
  }

  // @LINE:94
  class ReverseReferenceController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def indexGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "reference")
    }
  
  }

  // @LINE:96
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:96
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:73
  class ReverseMedicalController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:79
    def indexPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "medical")
    }
  
    // @LINE:75
    def listVitalsGet(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "medical/listVitals/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:81
    def deleteExistingProblem(patientId:Integer, problem:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "medical/deleteProblem/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("patientId", patientId)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("problem", problem)))
    }
  
    // @LINE:73
    def updateVitalsPost(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "medical/updateVitals/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:74
    def newVitalsGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "medical/newVitals")
    }
  
    // @LINE:76
    def editGet(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "medical/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:80
    def prescriptionRowGet(index:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "medical/prescriptionRow/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("index", index)))
    }
  
    // @LINE:77
    def editPost(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "medical/edit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:78
    def indexGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "medical")
    }
  
  }

  // @LINE:55
  class ReverseSearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def typeaheadPatientsJSONGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/patients")
    }
  
    // @LINE:56
    def doesPatientExist(query:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/check/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("query", query)))
    }
  
    // @LINE:61
    def typeaheadDiagnosisJSONGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/diagnoses")
    }
  
    // @LINE:62
    def typeaheadMedicationsWithIDJSONGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/medicationsWithID")
    }
  
    // @LINE:60
    def typeaheadCitiesJSONGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/cities")
    }
  
    // @LINE:55
    def handleSearch(page:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("page", page)))
    }
  
    // @LINE:63
    def typeaheadMedicationAdministrationsJSONGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/typeahead/medicationAdministrations")
    }
  
    // @LINE:57
    def doesPatientExistForSearch(first:String, last:String, phone:String, addr:String, age:Long, gender:String, city:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search/findMatch/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("first", first)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("last", last)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("phone", phone)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("addr", addr)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("age", age)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("gender", gender)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("city", city)))
    }
  
  }

  // @LINE:83
  class ReverseResearchController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:83
    def indexGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "research")
    }
  
    // @LINE:85
    def exportPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "research/exportData")
    }
  
    // @LINE:84
    def indexPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "research")
    }
  
  }

  // @LINE:87
  class ReversePDFController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:87
    def index(encounterId:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "pdf/encounter/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("encounterId", encounterId)))
    }
  
  }

  // @LINE:102
  class ReverseFeedbackController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:102
    def indexGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "feedback")
    }
  
    // @LINE:103
    def indexPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "feedback")
    }
  
  }

  // @LINE:89
  class ReverseSessionsController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def editPasswordPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login/reset")
    }
  
    // @LINE:89
    def delete(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:91
    def createPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:92
    def createGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:51
  class ReverseTriageController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def deletePatientPost(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "triage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:51
    def deleteEncounterPost(id:Integer, encounterId:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "history/encounter/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)) + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("encounterId", encounterId)))))
    }
  
    // @LINE:69
    def indexGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "triage")
    }
  
    // @LINE:70
    def indexPost(id:Integer): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "triage" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("id", id)))))
    }
  
    // @LINE:68
    def indexPopulatedGet(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "triage/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
  }


}
