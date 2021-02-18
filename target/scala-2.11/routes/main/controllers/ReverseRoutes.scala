// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/spencerklawans/Documents/newfemr/conf/routes
// @DATE:Wed Feb 17 23:54:59 PST 2021

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:99
package controllers {

  // @LINE:99
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:99
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
