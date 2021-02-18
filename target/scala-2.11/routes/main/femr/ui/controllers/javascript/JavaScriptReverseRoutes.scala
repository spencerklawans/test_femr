// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/spencerklawans/Documents/newfemr/conf/routes
// @DATE:Wed Feb 17 23:54:59 PST 2021

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package femr.ui.controllers.javascript {

  // @LINE:65
  class ReversePhotoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def GetPatientPhoto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PhotoController.GetPatientPhoto",
      """
        function(id0,showDefault1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "photo/patient/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0)) + _qS([(showDefault1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Boolean]].javascriptUnbind + """)("showDefault", showDefault1))])})
        }
      """
    )
  
    // @LINE:66
    def GetPhoto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PhotoController.GetPhoto",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "photo/encounter/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:43
  class ReversePharmaciesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def editGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PharmaciesController.editGet",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pharmacy/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:45
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PharmaciesController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pharmacy"})
        }
      """
    )
  
    // @LINE:46
    def indexPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PharmaciesController.indexPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pharmacy"})
        }
      """
    )
  
    // @LINE:44
    def editPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PharmaciesController.editPost",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pharmacy/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseApplicationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def removeTrailingSlash: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ApplicationController.removeTrailingSlash",
      """
        function(path0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("path", path0) + "/"})
        }
      """
    )
  
  }

  // @LINE:48
  class ReverseHistoryController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def indexEncounterGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HistoryController.indexEncounterGet",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history/encounter/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:49
    def updateEncounterPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HistoryController.updateEncounterPost",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "history/encounter/updateField/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:52
    def indexPatientGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HistoryController.indexPatientGet",
      """
        function(query0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history/patient/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("query", query0))})
        }
      """
    )
  
    // @LINE:53
    def indexPatientGetWithRankedMatches: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HistoryController.indexPatientGetWithRankedMatches",
      """
        function(first0,last1,phone2,addr3,age4,gender5,city6) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history/patient/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("first", first0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("last", last1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("phone", phone2)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("addr", addr3)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("age", age4)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("gender", gender5)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("city", city6))})
        }
      """
    )
  
    // @LINE:50
    def listTabFieldHistoryGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HistoryController.listTabFieldHistoryGet",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "history/encounter/listTabFieldHistory/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:94
  class ReverseReferenceController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:94
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ReferenceController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reference"})
        }
      """
    )
  
  }

  // @LINE:96
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:96
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:73
  class ReverseMedicalController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:79
    def indexPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.indexPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medical"})
        }
      """
    )
  
    // @LINE:75
    def listVitalsGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.listVitalsGet",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/listVitals/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:81
    def deleteExistingProblem: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.deleteExistingProblem",
      """
        function(patientId0,problem1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/deleteProblem/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("patientId", patientId0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("problem", problem1))})
        }
      """
    )
  
    // @LINE:73
    def updateVitalsPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.updateVitalsPost",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/updateVitals/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:74
    def newVitalsGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.newVitalsGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/newVitals"})
        }
      """
    )
  
    // @LINE:76
    def editGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.editGet",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:80
    def prescriptionRowGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.prescriptionRowGet",
      """
        function(index0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/prescriptionRow/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("index", index0))})
        }
      """
    )
  
    // @LINE:77
    def editPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.editPost",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "medical/edit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:78
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.MedicalController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "medical"})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseSearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:58
    def typeaheadPatientsJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadPatientsJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/patients"})
        }
      """
    )
  
    // @LINE:56
    def doesPatientExist: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.doesPatientExist",
      """
        function(query0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/check/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("query", query0))})
        }
      """
    )
  
    // @LINE:61
    def typeaheadDiagnosisJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadDiagnosisJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/diagnoses"})
        }
      """
    )
  
    // @LINE:62
    def typeaheadMedicationsWithIDJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadMedicationsWithIDJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/medicationsWithID"})
        }
      """
    )
  
    // @LINE:60
    def typeaheadCitiesJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadCitiesJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/cities"})
        }
      """
    )
  
    // @LINE:55
    def handleSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.handleSearch",
      """
        function(page0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("page", page0))})
        }
      """
    )
  
    // @LINE:63
    def typeaheadMedicationAdministrationsJSONGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.typeaheadMedicationAdministrationsJSONGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/typeahead/medicationAdministrations"})
        }
      """
    )
  
    // @LINE:57
    def doesPatientExistForSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SearchController.doesPatientExistForSearch",
      """
        function(first0,last1,phone2,addr3,age4,gender5,city6) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/findMatch/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("first", first0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("last", last1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("phone", phone2)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("addr", addr3)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("age", age4)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("gender", gender5)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("city", city6))})
        }
      """
    )
  
  }

  // @LINE:83
  class ReverseResearchController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:83
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ResearchController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "research"})
        }
      """
    )
  
    // @LINE:85
    def exportPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ResearchController.exportPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "research/exportData"})
        }
      """
    )
  
    // @LINE:84
    def indexPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.ResearchController.indexPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "research"})
        }
      """
    )
  
  }

  // @LINE:87
  class ReversePDFController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:87
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.PDFController.index",
      """
        function(encounterId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pdf/encounter/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("encounterId", encounterId0))})
        }
      """
    )
  
  }

  // @LINE:102
  class ReverseFeedbackController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:102
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.FeedbackController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback"})
        }
      """
    )
  
    // @LINE:103
    def indexPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.FeedbackController.indexPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "feedback"})
        }
      """
    )
  
  }

  // @LINE:89
  class ReverseSessionsController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def editPasswordPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SessionsController.editPasswordPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/reset"})
        }
      """
    )
  
    // @LINE:89
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SessionsController.delete",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:91
    def createPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SessionsController.createPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:92
    def createGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.SessionsController.createGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:51
  class ReverseTriageController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def deletePatientPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.TriageController.deletePatientPost",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "triage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:51
    def deleteEncounterPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.TriageController.deleteEncounterPost",
      """
        function(id0,encounterId1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "history/encounter/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0)) + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("encounterId", encounterId1)])})
        }
      """
    )
  
    // @LINE:69
    def indexGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.TriageController.indexGet",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "triage"})
        }
      """
    )
  
    // @LINE:70
    def indexPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.TriageController.indexPost",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "triage" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:68
    def indexPopulatedGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "femr.ui.controllers.TriageController.indexPopulatedGet",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "triage/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }


}
