
package femr.ui.views.html.medical

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

object newVitals extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[femr.ui.models.medical.EditViewModelGet,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(viewModel: femr.ui.models.medical.EditViewModelGet, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<link rel="stylesheet" href=""""),_display_(/*3.31*/assets/*3.37*/.path("css/medical/newVitals.css")),format.raw/*3.71*/("""" xmlns="http://www.w3.org/1999/xhtml">
<script type="text/javascript" src=""""),_display_(/*4.38*/assets/*4.44*/.path("js/medical/newVitals.js")),format.raw/*4.76*/(""""></script>
<script type="text/javascript" src=""""),_display_(/*5.38*/assets/*5.44*/.path("js/shared/vitalClientValidation.js")),format.raw/*5.87*/(""""></script>
<div id="vitalContainer">

    <div id="left">
        <div class="vitalWrap">
            <label>BP</label>
            <br/>
            <input type="number" class="fInput" id="newSystolic" placeholder="systolic"/>
            <input type="number" class="fInput" id="newDiastolic" placeholder="diastolic"/>
        </div>
        <div class="vitalWrap">
            <label>HR</label>
            <br/>
            <input type="number" class="fInput" id="newHeartRate" placeholder="bpm"/>
        </div>
        <div class="vitalWrap">
            <label>T</label>
            <br/>
            """),_display_(/*23.14*/if(viewModel.getSettings.isMetric)/*23.48*/ {_display_(Seq[Any](format.raw/*23.50*/(""" """),format.raw/*23.51*/("""<!---  Alaa Serhan -->
                <input type="number" class="fInput" id="newTemperature" placeholder="C"/>
            """)))}/*25.15*/else/*25.20*/{_display_(Seq[Any](format.raw/*25.21*/("""
                """),format.raw/*26.17*/("""<input type="number" class="fInput" id="newTemperature" placeholder="F"/>
            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</div>
        <div class="vitalWrap">
            <label>RR</label>
            <br/>
            <input type="number" class="fInput" id="newRespiratoryRate" placeholder="bpm"/>
        </div>
        <label class="btn btn-default" for="newSmoker">Smoking
        <input type="checkbox" class="fButton" id="newSmoker" name="smoker" value="1" />
        </label>

        <br/>
        <label class="btn btn-default" for="newDiabetic">Diabetes
        <input type="checkbox" class="fButton" id="newDiabetic" name="diabetic" value="1" />
        </label>
        <br>
        <label class="btn btn-default" for="newAlcohol">Alcohol
        <input type="checkbox" class="fButton" id="newAlcohol" name="alcohol" value="1" />
        </label>
        <br>
        <label class="btn btn-default" for="newCholesterol">Cholesterol
            <input type="checkbox" class="fButton" id="newCholesterol" name="cholesterol" value="1" />
        </label>
        <br>
        <label class="btn btn-default" for="newHypertension">Hypertension
            <input type="checkbox" class="fButton" id="newHypertension" name="hypertension" value="1" />
        </label>
        <br/>

    </div>
    <div id="right">
        <div class="vitalWrap">
            <label>Gluc</label>
            <br/>
            <input type="number" class="fInput" id="newGlucose" placeholder="mg/dl"/>
        </div>
        <div class="vitalWrap">
            <label>SpO2</label>
            <br/>
            <input type="number" class="fInput" id="newOxygen" placeholder="%"/>
        </div>
        <div class="vitalWrap">
            <label>Ht</label>
            <br/>
            """),_display_(/*71.14*/if(viewModel.getSettings.isMetric)/*71.48*/ {_display_(Seq[Any](format.raw/*71.50*/(""" """),format.raw/*71.51*/("""<!---  Alaa Serhan -->
                <input type="number" class="fInput" id="newHeightFeet" placeholder="m"/>
                <input type="number" class="fInput" id="newHeightInches" placeholder="cm"/>
            """)))}/*74.15*/else/*74.20*/{_display_(Seq[Any](format.raw/*74.21*/("""
                """),format.raw/*75.17*/("""<input type="number" class="fInput" id="newHeightFeet" placeholder="ft"/>
                <input type="number" class="fInput" id="newHeightInches" placeholder="in"/>
            """)))}),format.raw/*77.14*/("""
        """),format.raw/*78.9*/("""</div>
        <div class="vitalWrap">
            <label>Wt</label>
            <br/>
            """),_display_(/*82.14*/if(viewModel.getSettings.isMetric)/*82.48*/ {_display_(Seq[Any](format.raw/*82.50*/(""" """),format.raw/*82.51*/("""<!---  Alaa Serhan -->
                <input type="number" class="fInput" id="newWeight" placeholder="kgs"/>
            """)))}/*84.15*/else/*84.20*/{_display_(Seq[Any](format.raw/*84.21*/("""
                """),format.raw/*85.17*/("""<input type="number" class="fInput" id="newWeight" placeholder="lbs"/>
            """)))}),format.raw/*86.14*/("""
        """),format.raw/*87.9*/("""</div>
        <div class="vitalWrap">
            <label>WP</label> <!--- Sam Zanni -->
            <br/>
            <input type="number" class="fInput" id="weeksPreg" placeholder="weeks"/>
        </div>
    </div>
    <div id="theButtons">
        <button type="button" id="saveVitalsBtn" class="fButton">Save</button>
        <button type="button" id="cancelVitalsBtn" class="fButton">Cancel</button>
    </div>

</div>




"""))
      }
    }
  }

  def render(viewModel:femr.ui.models.medical.EditViewModelGet,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(viewModel,assets)

  def f:((femr.ui.models.medical.EditViewModelGet,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (viewModel,assets) => apply(viewModel,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 17 23:54:59 PST 2021
                  SOURCE: /Users/spencerklawans/Documents/newfemr/app/femr/ui/views/medical/newVitals.scala.html
                  HASH: 4556bd5bc01aa2e048d957a9bad2ac2a9d070463
                  MATRIX: 1014->1|1182->76|1209->77|1265->107|1279->113|1333->147|1436->224|1450->230|1502->262|1577->311|1591->317|1654->360|2290->969|2333->1003|2373->1005|2402->1006|2547->1133|2560->1138|2599->1139|2644->1156|2762->1243|2798->1252|4479->2906|4522->2940|4562->2942|4591->2943|4827->3161|4840->3166|4879->3167|4924->3184|5134->3363|5170->3372|5297->3472|5340->3506|5380->3508|5409->3509|5551->3633|5564->3638|5603->3639|5648->3656|5763->3740|5799->3749
                  LINES: 28->1|33->2|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|36->5|36->5|54->23|54->23|54->23|54->23|56->25|56->25|56->25|57->26|58->27|59->28|102->71|102->71|102->71|102->71|105->74|105->74|105->74|106->75|108->77|109->78|113->82|113->82|113->82|113->82|115->84|115->84|115->84|116->85|117->86|118->87
                  -- GENERATED --
              */
          