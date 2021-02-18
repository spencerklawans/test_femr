// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/spencerklawans/Documents/newfemr/conf/routes
// @DATE:Wed Feb 17 23:54:59 PST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:41
package femr.ui.controllers.manager {

  // @LINE:41
  class ReverseManagerController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:41
    def indexGet(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "manager")
    }
  
  }


}
