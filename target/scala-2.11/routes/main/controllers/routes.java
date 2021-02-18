// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/spencerklawans/Documents/newfemr/conf/routes
// @DATE:Wed Feb 17 23:54:59 PST 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
