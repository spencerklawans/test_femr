
package femr.ui.views.html.admin.users

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[femr.common.dtos.CurrentUser,play.data.Form[femr.ui.models.admin.users.CreateViewModel],java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},java.util.List[_$2] forSome { 
   type _$2 >: _root_.scala.Nothing <: java.lang.String
},AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser,
        form: play.data.Form[femr.ui.models.admin.users.CreateViewModel],
        messages: java.util.List[_ <: java.lang.String],
        availableRoles: java.util.List[_ <: java.lang.String],
        assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*7.2*/import views.html.helper.FieldConstructor
/*8.2*/import femr.ui.views.html.partials.admin.inputFieldConstructor
/*9.2*/import femr.ui.views.html.layouts.admin
/*10.2*/import femr.ui.controllers.admin.routes.UsersController

def /*15.6*/additionalStyles/*15.22*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*15.26*/("""
        """),format.raw/*16.9*/("""<link rel="stylesheet" href=""""),_display_(/*16.39*/assets/*16.45*/.path("css/admin/users.css")),format.raw/*16.73*/("""">
    """)))};def /*18.6*/additionalScripts/*18.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*18.27*/("""
        """),format.raw/*19.9*/("""<script type="text/javascript" src=""""),_display_(/*19.46*/assets/*19.52*/.path("js/admin/users.js")),format.raw/*19.78*/(""""></script>
    """)))};def /*21.6*/additionalMessages/*21.24*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.28*/("""
    """),_display_(/*22.6*/for(message <- messages) yield /*22.30*/ {_display_(Seq[Any](format.raw/*22.32*/("""
        """),format.raw/*23.9*/("""<p class="adminMessage">"""),_display_(/*23.34*/message),format.raw/*23.41*/("""</p>
    """)))}),format.raw/*24.6*/("""
    """)))};implicit def /*11.6*/implicitField/*11.19*/ = {{
        FieldConstructor(inputFieldConstructor.f)
    }};
Seq[Any](format.raw/*6.1*/("""
"""),format.raw/*11.1*/("""    """),format.raw/*13.6*/("""

    """),format.raw/*17.6*/("""
    """),format.raw/*20.6*/("""
    """),format.raw/*25.6*/("""

"""),_display_(/*27.2*/admin("Add User", currentUser, styles = additionalStyles, scripts = additionalScripts, message = additionalMessages, assets = assets)/*27.135*/ {_display_(Seq[Any](format.raw/*27.137*/("""
    """),format.raw/*28.5*/("""<div id="createWrap">
    """),_display_(/*29.6*/helper/*29.12*/.form(action = UsersController.createPost(), 'class -> "form-horizontal", 'name -> "createForm")/*29.108*/ {_display_(Seq[Any](format.raw/*29.110*/("""

        """),_display_(/*31.10*/helper/*31.16*/.inputText(form("email"),
            'class -> "fInput",
            'placeholder -> "Email Address",
            '_label -> "Email Address",
            '_isRequired -> true
        )),format.raw/*36.10*/("""

        """),_display_(/*38.10*/helper/*38.16*/.inputPassword(form("password"),
            'class -> "fInput",
            'placeholder -> "Password",
            '_label -> "Password",
            '_isRequired -> true
        )),format.raw/*43.10*/("""
"""),format.raw/*44.1*/("""<!-- added for FEMR-159 added by Vivek-->

        """),_display_(/*46.10*/helper/*46.16*/.inputPassword(form("passwordVerify"),
            'class -> "fInput",
            'placeholder -> "Verify Password",
            '_label -> null,
            'type -> "password"
        )),format.raw/*51.10*/("""

        """),_display_(/*53.10*/helper/*53.16*/.inputText(form("firstName"),
            'class -> "fInput",
            'placeholder -> "First Name",
            '_label -> "First Name",
            '_isRequired -> true
        )),format.raw/*58.10*/("""

        """),_display_(/*60.10*/helper/*60.16*/.inputText(form("lastName"),
            'class -> "fInput",
            'placeholder -> "Last Name",
            '_label -> "Last Name",
            '_isRequired -> false
        )),format.raw/*65.10*/("""

        """),_display_(/*67.10*/helper/*67.16*/.inputText(form("notes"),
            'class -> "fInput",
            'placeholder -> "About User",
            '_label -> "About User",
            '_isRequired -> false
        )),format.raw/*72.10*/("""

        """),format.raw/*74.9*/("""<div id="roleWrap">
            <label for="roles">Roles<span id="roles" class="red bold">*</span></label>
            <span class="errors"></span>
            """),_display_(/*77.14*/for(error <- form("roles").errors) yield /*77.48*/ {_display_(Seq[Any](format.raw/*77.50*/("""
                """),format.raw/*78.17*/("""<p class="createUserError"> """),_display_(/*78.46*/error/*78.51*/.message),format.raw/*78.59*/("""</p>
            """)))}),format.raw/*79.14*/("""

            """),format.raw/*81.13*/("""<br/>
            """),_display_(/*82.14*/for(role <- availableRoles) yield /*82.41*/ {_display_(Seq[Any](format.raw/*82.43*/("""
                """),format.raw/*83.17*/("""<label class="btn btn-default">
                    <input type="checkbox" name="roles[]" value=""""),_display_(/*84.67*/role),format.raw/*84.71*/(""""> """),_display_(/*84.75*/role),format.raw/*84.79*/("""
                """),format.raw/*85.17*/("""</label>
                <br/>
            """)))}),format.raw/*87.14*/("""
        """),format.raw/*88.9*/("""</div>
    </div>
    <button class="fButton fSubmitButton" id="addUserSubmitBtn" type="submit">Submit</button>
""")))}),format.raw/*91.2*/("""
""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,form:play.data.Form[femr.ui.models.admin.users.CreateViewModel],messages:java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},availableRoles:java.util.List[_$2] forSome { 
   type _$2 >: _root_.scala.Nothing <: java.lang.String
},assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,form,messages,availableRoles,assets)

  def f:((femr.common.dtos.CurrentUser,play.data.Form[femr.ui.models.admin.users.CreateViewModel],java.util.List[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: java.lang.String
},java.util.List[_$2] forSome { 
   type _$2 >: _root_.scala.Nothing <: java.lang.String
},AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,form,messages,availableRoles,assets) => apply(currentUser,form,messages,availableRoles,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 17 23:54:59 PST 2021
                  SOURCE: /Users/spencerklawans/Documents/newfemr/app/femr/ui/views/admin/users/create.scala.html
                  HASH: 8166e2c668687d6054ed6ef84c30c37373995157
                  MATRIX: 1241->1|1581->271|1630->314|1700->378|1748->419|1817->561|1842->577|1923->581|1959->590|2016->620|2031->626|2080->654|2111->668|2137->685|2218->689|2254->698|2318->735|2333->741|2380->767|2420->790|2447->808|2528->812|2560->818|2600->842|2640->844|2676->853|2728->878|2756->885|2796->895|2834->480|2856->493|2946->269|2974->475|3005->554|3038->662|3070->784|3102->901|3131->904|3274->1037|3315->1039|3347->1044|3400->1071|3415->1077|3521->1173|3562->1175|3600->1186|3615->1192|3821->1377|3859->1388|3874->1394|4077->1576|4105->1577|4184->1629|4199->1635|4408->1823|4446->1834|4461->1840|4665->2023|4703->2034|4718->2040|4920->2221|4958->2232|4973->2238|5174->2418|5211->2428|5399->2589|5449->2623|5489->2625|5534->2642|5590->2671|5604->2676|5633->2684|5682->2702|5724->2716|5770->2735|5813->2762|5853->2764|5898->2781|6023->2879|6048->2883|6079->2887|6104->2891|6149->2908|6224->2952|6260->2961|6403->3074
                  LINES: 32->1|39->7|40->8|41->9|42->10|44->15|44->15|46->15|47->16|47->16|47->16|47->16|48->18|48->18|50->18|51->19|51->19|51->19|51->19|52->21|52->21|54->21|55->22|55->22|55->22|56->23|56->23|56->23|57->24|58->11|58->11|61->6|62->11|62->13|64->17|65->20|66->25|68->27|68->27|68->27|69->28|70->29|70->29|70->29|70->29|72->31|72->31|77->36|79->38|79->38|84->43|85->44|87->46|87->46|92->51|94->53|94->53|99->58|101->60|101->60|106->65|108->67|108->67|113->72|115->74|118->77|118->77|118->77|119->78|119->78|119->78|119->78|120->79|122->81|123->82|123->82|123->82|124->83|125->84|125->84|125->84|125->84|126->85|128->87|129->88|132->91
                  -- GENERATED --
              */
          