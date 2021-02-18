
package femr.ui.views.html.triage

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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[femr.common.dtos.CurrentUser,femr.ui.models.triage.IndexViewModelGet,AssetsFinder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: femr.common.dtos.CurrentUser, viewModel: femr.ui.models.triage.IndexViewModelGet, assets: AssetsFinder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import femr.common.models.CityItem
/*4.2*/import femr.ui.views.html.layouts.main
/*5.2*/import femr.ui.views.html.partials.search
/*6.2*/import femr.ui.controllers.routes.TriageController
/*7.2*/import femr.ui.controllers.routes.HistoryController
/*8.2*/import femr.ui.views.html.partials.triage._
/*9.2*/import femr.ui.controllers.routes.SearchController
/*10.2*/import femr.ui.views.html.partials.helpers.outputStringOrNA

def /*13.2*/additionalScripts/*13.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.23*/("""
    """),format.raw/*14.5*/("""<script type="text/javascript" src=""""),_display_(/*14.42*/assets/*14.48*/.path("js/libraries/touchit-1.0.0.js")),format.raw/*14.86*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*15.42*/assets/*15.48*/.path("js/libraries/jquery.jWindowCrop.js")),format.raw/*15.91*/(""""></script>
    """),format.raw/*16.91*/("""
    """),format.raw/*17.5*/("""<script type="text/javascript" src=""""),_display_(/*17.42*/assets/*17.48*/.path("js/triage/triage.js")),format.raw/*17.76*/(""""></script>

    <script type="text/javascript" src=""""),_display_(/*19.42*/assets/*19.48*/.path("js/libraries/exif.js")),format.raw/*19.77*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*20.42*/assets/*20.48*/.path("js/libraries/megapix-image.js")),format.raw/*20.86*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*21.42*/assets/*21.48*/.path("js/triage/triageClientValidation.js")),format.raw/*21.92*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*22.42*/assets/*22.48*/.path("js/shared/vitalClientValidation.js")),format.raw/*22.91*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*23.42*/assets/*23.48*/.path("js/libraries/handlebars.min.js")),format.raw/*23.87*/(""""></script>
    <script type="text/javascript" src=""""),_display_(/*24.42*/assets/*24.48*/.path("js/libraries/typeahead.bundle.min.js")),format.raw/*24.93*/(""""></script>
""")))};def /*26.2*/additionalStyles/*26.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*26.22*/("""
    """),format.raw/*27.5*/("""<link rel="stylesheet" href=""""),_display_(/*27.35*/assets/*27.41*/.path("css/triage.css")),format.raw/*27.64*/("""">
    <link rel="stylesheet" href=""""),_display_(/*28.35*/assets/*28.41*/.path("css/libraries/datepicker.css")),format.raw/*28.78*/("""">
""")))};
Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*11.1*/("""

"""),format.raw/*25.2*/("""
"""),format.raw/*29.2*/("""
"""),_display_(/*30.2*/main("Triage", currentUser, styles = additionalStyles, scripts = additionalScripts, search = search("triage"), assets = assets)/*30.129*/ {_display_(Seq[Any](format.raw/*30.131*/("""

    """),format.raw/*32.5*/("""<div id="triageContentWrap">
        """),_display_(/*33.10*/if(viewModel.isSearchError)/*33.37*/ {_display_(Seq[Any](format.raw/*33.39*/("""
            """),format.raw/*34.13*/("""<p>That patient could not be found.</p>
        """)))}),format.raw/*35.10*/("""
        """),_display_(/*36.10*/if(viewModel.isLinkToMedical())/*36.41*/{_display_(Seq[Any](format.raw/*36.42*/("""

            """),format.raw/*38.13*/("""<p class="newEncounterWrap"> Patient has an open encounter <a class="btn btn-danger" href="/medical/edit/"""),_display_(/*38.119*/viewModel/*38.128*/.getPatient().getId()),format.raw/*38.149*/("""" target="blank">Go To Medical</a></p>
        """)))}),format.raw/*39.10*/("""
        """),format.raw/*40.9*/("""<h2 class="text-center">Check In - Triage</h2>

        """),_display_(/*42.10*/helper/*42.16*/.form(action = TriageController.indexPost(viewModel.getPatient.getId), 'class -> "form-horizontal triage-form", 'enctype -> "multipart/form-data")/*42.162*/ {_display_(Seq[Any](format.raw/*42.164*/("""
            """),format.raw/*43.13*/("""<div id="genInfoWrap" class="sectionBackground backgroundForWrap">

              <h2>General Info</h2>

                """),_display_(/*47.18*/inputText("First Name", "firstName", true, if(viewModel != null) viewModel.getPatient.getFirstName else null, "text")),format.raw/*47.135*/("""
                """),format.raw/*48.17*/("""<br>
                """),_display_(/*49.18*/inputText("Last Name", "lastName", true, if(viewModel != null) viewModel.getPatient.getLastName else null, "text")),format.raw/*49.132*/("""
                """),format.raw/*50.17*/("""<br>
                """),_display_(/*51.18*/inputText("Phone Number", "phoneNumber", false, if(viewModel != null) viewModel.getPatient.getPhoneNumber else null, "tel")),format.raw/*51.141*/("""
                """),format.raw/*52.17*/("""<br>
                """),_display_(/*53.18*/inputText("Address", "address", false, if(viewModel != null) viewModel.getPatient.getAddress else null, "text")),format.raw/*53.129*/("""
                """),format.raw/*54.17*/("""<br>
                <div class="generalInfoInput" id="citySearchContainer">
                    <label for="city">City<span class="red bold">*</span></label>
                    """),_display_(/*57.22*/if(viewModel.getPatient.getCity == null)/*57.62*/ {_display_(Seq[Any](format.raw/*57.64*/("""
                        """),format.raw/*58.25*/("""<input type = "text" class="citySearch fInput" name="city" id="city" required>
                    """)))}/*59.23*/else/*59.28*/{_display_(Seq[Any](format.raw/*59.29*/("""
                        """),format.raw/*60.25*/("""<input type = "text" class = "citySearch fInput" name="city" id="city" value=""""),_display_(/*60.104*/viewModel/*60.113*/.getPatient.getCity),format.raw/*60.132*/(""""readonly>
                        """)))}),format.raw/*61.26*/("""
                """),format.raw/*62.17*/("""</div>
                <br>

                <div id="ageClassificationWrap">
                    <label>Age<span class="red bold">*</span></label>

                    <label id="conflictingAgeMessage" class="error-message" style="display: none">Birth Date and Age group are conflicting</label>

                    """),_display_(/*70.22*/inputAge("Age", "Years", "years", "Months", "months", if(viewModel != null) viewModel.getPatient else null)),format.raw/*70.129*/("""
                    """),format.raw/*71.21*/("""<span class="orSpan">OR</span>
                    """),_display_(/*72.22*/inputDate("Birth Date", "age", if(viewModel != null) viewModel.getPatient.getBirth else null)),format.raw/*72.115*/("""
                    """),format.raw/*73.21*/("""<span class="orSpan">OR</span>
                    <div class="generalInfoInput">
                        <div id="classificationRadioWrap">
                        """),_display_(/*76.26*/for((key, valyew) <- viewModel.getPossibleAgeClassifications) yield /*76.87*/ {_display_(Seq[Any](format.raw/*76.89*/("""
                            """),format.raw/*77.29*/("""<label><input type="radio" name="ageClassification" value=""""),_display_(/*77.89*/key),format.raw/*77.92*/("""" /> """),_display_(/*77.98*/key),format.raw/*77.101*/(""" """),format.raw/*77.102*/("""<span>"""),_display_(/*77.109*/valyew),format.raw/*77.115*/("""</span></label>
                        """)))}),format.raw/*78.26*/("""
                        """),format.raw/*79.25*/("""</div>
                    </div>
                </div>

                <br>
                """),_display_(/*84.18*/inputGender(viewModel)),format.raw/*84.40*/("""
                """),format.raw/*85.17*/("""<br>


                <div class="generalInfoInput">


                    <label for="photo">Patient Photo</label>
                    <div id="photoInputFormDiv">
                        <input type="file" class="fInput" id="photoInput" name="patientPhoto" placeholder="Choose Image" />
                        <textarea id="photoInputCropped" class="hidden" name="patientPhotoCropped"></textarea>
                    </div>
                    <div id="patientPhotoDiv" hidden="true">
                        <div class="btn-group" >
                            <img id="patientPhoto" class="crop_me" alt="" src=""""),_display_(/*98.81*/viewModel/*98.90*/.getPatient.getPathToPhoto),format.raw/*98.116*/("""" />

                            <div class="btn-toolbar" role="buttons">
                                <div class="btn-group" id="zoomControls">
                                    <button type="button" id="btnZoomIn" class="btn btn-default btn-lg">
                                        <span class="glyphicon glyphicon-zoom-in"></span>
                                    </button>
                                    <button type="button" id="btnZoomOut" class="btn btn-default btn-lg">
                                        <span class="glyphicon glyphicon-zoom-out"></span>
                                    </button>
                                </div>
                                <div class="btn-group">
                                    <button id="btnDeletePhoto" type="button" class="btn btn-danger btn-lg pull-right">
                                        <span class="glyphicon glyphicon-trash"></span>
                                    </button>
                                </div>
                            </div>
                            <canvas id="patientPhotoCanvas" class="hidden"></canvas>
                        </div>
                    </div>
                    <input class="hidden" type="checkbox" name="deletePhoto" value="true" id="deletePhoto">


                </div>

            </div>

            <div id="vitalsWrap" class="sectionBackground backgroundForWrap">
                <h2>Vitals</h2>

                <div id="vitalContainer">

                    <div id="leftVitalsWrap">
                            <!-- Alaa Serhan - Referenced in triage.js for calculating proper BMI
                            as well as in vitalClientValidation.js for validating height inputs -->
                        """),_display_(/*133.26*/if(viewModel.getSettings.isMetric)/*133.60*/ {_display_(Seq[Any](format.raw/*133.62*/("""
                            """),format.raw/*134.29*/("""<input type="hidden" id="vitalsUnits" value="metric" />
                        """)))}/*135.27*/else/*135.32*/{_display_(Seq[Any](format.raw/*135.33*/("""
                            """),format.raw/*136.29*/("""<input type="hidden" id="vitalUnits" value="imp" />
                        """)))}),format.raw/*137.26*/("""

                        """),format.raw/*139.25*/("""<div class="vitalWrap">
                            <label for="temperature">Temperature</label> <!---  Alaa Serhan -->
                            """),_display_(/*141.30*/if(viewModel.getSettings.isMetric)/*141.64*/ {_display_(Seq[Any](format.raw/*141.66*/("""
                                """),format.raw/*142.33*/("""<input type="number" step="any" min="0" class="fInput fVital" id=""""),_display_(/*142.100*/viewModel/*142.109*/.getVitalNames.get(2).getName),format.raw/*142.138*/("""" name=""""),_display_(/*142.147*/viewModel/*142.156*/.getVitalNames.get(2).getName),format.raw/*142.185*/("""" placeholder="&#176;C"/>
                            """)))}/*143.31*/else/*143.36*/{_display_(Seq[Any](format.raw/*143.37*/("""
                                """),format.raw/*144.33*/("""<input type="number" step="any" min="0" class="fInput fVital" id=""""),_display_(/*144.100*/viewModel/*144.109*/.getVitalNames.get(2).getName),format.raw/*144.138*/("""" name=""""),_display_(/*144.147*/viewModel/*144.156*/.getVitalNames.get(2).getName),format.raw/*144.185*/("""" placeholder="&#176;F"/>
                            """)))}),format.raw/*145.30*/("""

                        """),format.raw/*147.25*/("""</div>

                        <div class="vitalWrap">
                            <label for="bloodPressureSystolic" id="bloodPressureTitle">Blood Pressure</label>
                            <div class="doubleVital">
                                <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*152.96*/viewModel/*152.105*/.getVitalNames.get(7).getName),format.raw/*152.134*/("""" placeholder="Systolic" name=""""),_display_(/*152.166*/viewModel/*152.175*/.getVitalNames.get(7).getName),format.raw/*152.204*/(""""/>
                                <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*153.96*/viewModel/*153.105*/.getVitalNames.get(8).getName),format.raw/*153.134*/("""" placeholder="Diastolic" name=""""),_display_(/*153.167*/viewModel/*153.176*/.getVitalNames.get(8).getName),format.raw/*153.205*/(""""/>
                            </div>
                        </div>
                        <div class="vitalWrap">
                            <label for="heartRate">Heart Rate</label>
                            <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*158.92*/viewModel/*158.101*/.getVitalNames.get(1).getName),format.raw/*158.130*/("""" name=""""),_display_(/*158.139*/viewModel/*158.148*/.getVitalNames.get(1).getName),format.raw/*158.177*/("""" placeholder="bpm"/>
                        </div>

                        <div class="vitalWrap">
                            <label for="respirations">Respirations</label>
                            <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*163.92*/viewModel/*163.101*/.getVitalNames.get(0).getName),format.raw/*163.130*/("""" name=""""),_display_(/*163.139*/viewModel/*163.148*/.getVitalNames.get(0).getName),format.raw/*163.177*/("""" placeholder="bpm"/>
                        </div>

                        <div class="vitalWrap">
                            <label for="weeksPregnant">Weeks Pregnant</label>


                            """),_display_(/*170.30*/if(viewModel.getPatient.getSex == "Female")/*170.73*/ {_display_(Seq[Any](format.raw/*170.75*/("""
                                """),format.raw/*171.33*/("""<input type="number" step="number" min="0" class="fInput" id="weeksPregnant" name="weeksPregnant" placeholder="Weeks"/>
                            """)))}/*172.31*/else/*172.36*/{_display_(Seq[Any](format.raw/*172.37*/("""
                                """),format.raw/*173.33*/("""<input type="number" step="number" min="0" class="fInput" id="weeksPregnant" name="weeksPregnant" placeholder="Weeks" disabled/>
                            """)))}),format.raw/*174.30*/("""


                        """),format.raw/*177.25*/("""</div>
                            <!--Osman-->
                        <br/>

                        <div class="vitalWrap">
                            <label>History of:</label>
                        </div>

                        <label class="btn btn-default"> Diabetes
                            <input type="checkbox" step="any" class="fButton" id="diabetic" name="diabetic" value="1">
                        </label>
                        <br>
                        <label class="btn btn-default">Hypertension
                            <input type="checkbox" step="any" class="fButton" id="hypertension" name="hypertension" value="1">
                        </label>
                        <br>
                        <label class="btn btn-default">High Cholesterol
                            <input type="checkbox" step="any" class="fButton" id="cholesterol" name="cholesterol" value="1">
                        </label>
                        <br>
                        <label class="btn btn-default"> Tobacco Use Disorder
                            <input type="checkbox" step="any" class="fButton" id="smoker" name="smoker" value="1">
                        </label>
                        <br>
                        <label class="btn btn-default">Substance/Alcohol Abuse
                            <input type="checkbox" step="any" class="fButton" id="alcohol" name="alcohol" value="1">
                        </label>
                        <br>


                    </div>


                    <div id="rightVitalsWrap">
                        """),_display_(/*211.26*/if(viewModel.getSettings.isMetric)/*211.60*/ {_display_(Seq[Any](format.raw/*211.62*/(""" """),format.raw/*211.63*/("""<!-- Alaa Serhan -->
                            <input type="hidden" id="vitalsUnits" value="metric" />
                        """)))}/*213.27*/else/*213.32*/{_display_(Seq[Any](format.raw/*213.33*/("""
                            """),format.raw/*214.29*/("""<input type="hidden" id="vitalUnits" value="imp" />
                        """)))}),format.raw/*215.26*/("""


                        """),format.raw/*218.25*/("""<div class="vitalWrap">
                            <label for="oxygen">Oxygen Saturation</label>

                            <input type="number" step="any" min="0" class="fInput" id=""""),_display_(/*221.89*/viewModel/*221.98*/.getVitalNames.get(3).getName),format.raw/*221.127*/("""" name=""""),_display_(/*221.136*/viewModel/*221.145*/.getVitalNames.get(3).getName),format.raw/*221.174*/("""" placeholder="%"/>
                        </div>
                        <div class="vitalWrap">

                            <label for="heightFeet">Height</label>
                            <div class="doubleVital">
                            """),_display_(/*227.30*/if(viewModel.getSettings.isMetric)/*227.64*/ {_display_(Seq[Any](format.raw/*227.66*/(""" """),format.raw/*227.67*/("""<!---  Alaa Serhan -->
                                <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*228.96*/viewModel/*228.105*/.getVitalNames.get(4).getName),format.raw/*228.134*/("""" placeholder="Meters" name=""""),_display_(/*228.164*/viewModel/*228.173*/.getVitalNames.get(4).getName),format.raw/*228.202*/(""""/>
                                <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*229.96*/viewModel/*229.105*/.getVitalNames.get(5).getName),format.raw/*229.134*/("""" placeholder="Centimeters" name=""""),_display_(/*229.169*/viewModel/*229.178*/.getVitalNames.get(5).getName),format.raw/*229.207*/(""""/>
                            """)))}/*230.31*/else/*230.36*/{_display_(Seq[Any](format.raw/*230.37*/("""
                                """),format.raw/*231.33*/("""<input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*231.96*/viewModel/*231.105*/.getVitalNames.get(4).getName),format.raw/*231.134*/("""" placeholder="Feet" name=""""),_display_(/*231.162*/viewModel/*231.171*/.getVitalNames.get(4).getName),format.raw/*231.200*/(""""/>
                                <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*232.96*/viewModel/*232.105*/.getVitalNames.get(5).getName),format.raw/*232.134*/("""" placeholder="Inches" name=""""),_display_(/*232.164*/viewModel/*232.173*/.getVitalNames.get(5).getName),format.raw/*232.202*/(""""/>
                            """)))}),format.raw/*233.30*/("""
                            """),format.raw/*234.29*/("""</div>
                        </div>
                        <div class="vitalWrap">
                            <label for="weight">Weight</label>
                            """),_display_(/*238.30*/if(viewModel.getSettings.isMetric)/*238.64*/ {_display_(Seq[Any](format.raw/*238.66*/(""" """),format.raw/*238.67*/("""<!---  Alaa Serhan -->
                                <input type="number" step="any" min="0" class="fInput" id=""""),_display_(/*239.93*/viewModel/*239.102*/.getVitalNames.get(6).getName),format.raw/*239.131*/("""" name=""""),_display_(/*239.140*/viewModel/*239.149*/.getVitalNames.get(6).getName),format.raw/*239.178*/("""" placeholder="kgs"/>
                            """)))}/*240.31*/else/*240.36*/{_display_(Seq[Any](format.raw/*240.37*/("""
                                """),format.raw/*241.33*/("""<input type="number" step="any" min="0" class="fInput" id=""""),_display_(/*241.93*/viewModel/*241.102*/.getVitalNames.get(6).getName),format.raw/*241.131*/("""" name=""""),_display_(/*241.140*/viewModel/*241.149*/.getVitalNames.get(6).getName),format.raw/*241.178*/("""" placeholder="lbs"/>
                            """)))}),format.raw/*242.30*/("""

                        """),format.raw/*244.25*/("""</div>
                        <div class="vitalWrap">
                            <label >BMI</label>

                            <input type="text" id="bmi" class="fInput" disabled="true"/>
                        </div>
                        <div class="vitalWrap">
                            <label>Glucose</label>

                            <input type="number" step="number" min="0" class="fInput" id=""""),_display_(/*253.92*/viewModel/*253.101*/.getVitalNames.get(9).getName),format.raw/*253.130*/("""" name=""""),_display_(/*253.139*/viewModel/*253.148*/.getVitalNames.get(9).getName),format.raw/*253.177*/("""" placeholder="mg/dl"/>
                        </div>

                            <!--Osman-->
                        <br/>

                    </div>

                </div>
                <div id="chiefComplaintWrap">

                    <div id="chiefComplaintTitle">
                        <label for="chiefComplaint">
                            """),_display_(/*266.30*/if(viewModel.getSettings.isMultipleChiefComplaint)/*266.80*/ {_display_(Seq[Any](format.raw/*266.82*/("""
                                """),format.raw/*267.33*/("""<span id="addChiefComplaint">+</span>
                            """)))}),format.raw/*268.30*/("""
                            """),format.raw/*269.29*/("""Chief Complaint
                        </label>
                    </div>
"""),format.raw/*272.87*/("""

                    """),format.raw/*274.21*/("""<textarea class="fTextArea" id="chiefComplaint" name="chiefComplaint"></textarea>
                    """),_display_(/*275.22*/if(viewModel.getSettings.isMultipleChiefComplaint)/*275.72*/ {_display_(Seq[Any](format.raw/*275.74*/("""
                        """),format.raw/*276.25*/("""<ol id="chiefComplaintList">
                            """),format.raw/*277.120*/("""
                        """),format.raw/*278.25*/("""</ol>
                    """)))}),format.raw/*279.22*/("""

                """),format.raw/*281.17*/("""</div>

"""),format.raw/*283.57*/("""
"""),format.raw/*284.75*/("""
"""),format.raw/*285.110*/("""
"""),format.raw/*286.40*/("""
"""),format.raw/*287.110*/("""
"""),format.raw/*288.41*/("""
"""),format.raw/*289.86*/("""
"""),format.raw/*290.106*/("""
"""),format.raw/*291.81*/("""
"""),format.raw/*292.131*/("""
"""),format.raw/*293.90*/("""
"""),format.raw/*294.27*/("""
                """),format.raw/*295.17*/("""<div class="submitResetWrap">
                    <button type="submit" id="triageSubmitBtn" class="fButton fRedButton fSubmitButton pull-right">
                        Submit Patient</button>
                    <button type="button" class="fButton fOtherButton newPatientBtn pull-left">Reset Fields</button>


                    """),_display_(/*301.22*/if(viewModel.getPatient.getId != 0)/*301.57*/ {_display_(Seq[Any](format.raw/*301.59*/("""
                        """),format.raw/*302.25*/("""<a href=""""),_display_(/*302.35*/HistoryController/*302.52*/.indexPatientGet(viewModel.getPatient.getId.toString)),format.raw/*302.105*/("""" class="fButton fOtherButton pull-left" target="_blank">Patient History</a>
                    """)))}),format.raw/*303.22*/("""

                """),format.raw/*305.17*/("""</div>
            </div>

        </div>
""")))}),format.raw/*309.2*/("""
""")))}))
      }
    }
  }

  def render(currentUser:femr.common.dtos.CurrentUser,viewModel:femr.ui.models.triage.IndexViewModelGet,assets:AssetsFinder): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,viewModel,assets)

  def f:((femr.common.dtos.CurrentUser,femr.ui.models.triage.IndexViewModelGet,AssetsFinder) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,viewModel,assets) => apply(currentUser,viewModel,assets)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Feb 17 23:54:59 PST 2021
                  SOURCE: /Users/spencerklawans/Documents/newfemr/app/femr/ui/views/triage/index.scala.html
                  HASH: 4662ba84515545138c490d4d5da509502c503f5e
                  MATRIX: 1038->1|1228->121|1270->157|1316->197|1365->240|1423->292|1482->345|1533->390|1592->442|1665->505|1691->522|1772->526|1804->531|1868->568|1883->574|1942->612|2022->665|2037->671|2101->714|2145->816|2177->821|2241->858|2256->864|2305->892|2386->946|2401->952|2451->981|2531->1034|2546->1040|2605->1078|2685->1131|2700->1137|2765->1181|2845->1234|2860->1240|2924->1283|3004->1336|3019->1342|3079->1381|3159->1434|3174->1440|3240->1485|3276->1500|3301->1516|3382->1520|3414->1525|3471->1555|3486->1561|3530->1584|3594->1621|3609->1627|3667->1664|3709->119|3737->502|3766->1498|3794->1668|3822->1670|3959->1797|4000->1799|4033->1805|4098->1843|4134->1870|4174->1872|4215->1885|4295->1934|4332->1944|4372->1975|4411->1976|4453->1990|4587->2096|4606->2105|4649->2126|4728->2174|4764->2183|4848->2240|4863->2246|5019->2392|5060->2394|5101->2407|5250->2529|5389->2646|5434->2663|5483->2685|5619->2799|5664->2816|5713->2838|5858->2961|5903->2978|5952->3000|6085->3111|6130->3128|6337->3308|6386->3348|6426->3350|6479->3375|6598->3476|6611->3481|6650->3482|6703->3507|6810->3586|6829->3595|6870->3614|6937->3650|6982->3667|7327->3985|7456->4092|7505->4113|7584->4165|7699->4258|7748->4279|7941->4445|8018->4506|8058->4508|8115->4537|8202->4597|8226->4600|8259->4606|8284->4609|8314->4610|8349->4617|8377->4623|8449->4664|8502->4689|8625->4785|8668->4807|8713->4824|9358->5442|9376->5451|9424->5477|11228->7253|11272->7287|11313->7289|11371->7318|11472->7400|11486->7405|11526->7406|11584->7435|11693->7512|11748->7538|11925->7687|11969->7721|12010->7723|12072->7756|12168->7823|12188->7832|12240->7861|12278->7870|12298->7879|12350->7908|12425->7964|12439->7969|12479->7970|12541->8003|12637->8070|12657->8079|12709->8108|12747->8117|12767->8126|12819->8155|12906->8210|12961->8236|13304->8551|13324->8560|13376->8589|13437->8621|13457->8630|13509->8659|13636->8758|13656->8767|13708->8796|13770->8829|13790->8838|13842->8867|14149->9146|14169->9155|14221->9184|14259->9193|14279->9202|14331->9231|14627->9499|14647->9508|14699->9537|14737->9546|14757->9555|14809->9584|15048->9795|15101->9838|15142->9840|15204->9873|15373->10023|15387->10028|15427->10029|15489->10062|15679->10220|15735->10247|17354->11838|17398->11872|17439->11874|17469->11875|17619->12006|17633->12011|17673->12012|17731->12041|17840->12118|17896->12145|18111->12332|18130->12341|18182->12370|18220->12379|18240->12388|18292->12417|18570->12667|18614->12701|18655->12703|18685->12704|18831->12822|18851->12831|18903->12860|18962->12890|18982->12899|19034->12928|19161->13027|19181->13036|19233->13065|19297->13100|19317->13109|19369->13138|19422->13172|19436->13177|19476->13178|19538->13211|19629->13274|19649->13283|19701->13312|19758->13340|19778->13349|19830->13378|19957->13477|19977->13486|20029->13515|20088->13545|20108->13554|20160->13583|20225->13616|20283->13645|20489->13823|20533->13857|20574->13859|20604->13860|20747->13975|20767->13984|20819->14013|20857->14022|20877->14031|20929->14060|21000->14112|21014->14117|21054->14118|21116->14151|21204->14211|21224->14220|21276->14249|21314->14258|21334->14267|21386->14296|21469->14347|21524->14373|21967->14788|21987->14797|22039->14826|22077->14835|22097->14844|22149->14873|22536->15232|22596->15282|22637->15284|22699->15317|22798->15384|22856->15413|22961->15575|23012->15597|23143->15700|23203->15750|23244->15752|23298->15777|23385->15925|23439->15950|23498->15977|23545->15995|23582->16059|23612->16134|23643->16244|23673->16284|23704->16394|23734->16435|23764->16521|23795->16627|23825->16708|23856->16839|23886->16929|23916->16956|23962->16973|24324->17307|24369->17342|24410->17344|24464->17369|24502->17379|24529->17396|24605->17449|24735->17547|24782->17565|24856->17608
                  LINES: 28->1|31->3|32->4|33->5|34->6|35->7|36->8|37->9|38->10|40->13|40->13|42->13|43->14|43->14|43->14|43->14|44->15|44->15|44->15|45->16|46->17|46->17|46->17|46->17|48->19|48->19|48->19|49->20|49->20|49->20|50->21|50->21|50->21|51->22|51->22|51->22|52->23|52->23|52->23|53->24|53->24|53->24|54->26|54->26|56->26|57->27|57->27|57->27|57->27|58->28|58->28|58->28|60->2|61->11|63->25|64->29|65->30|65->30|65->30|67->32|68->33|68->33|68->33|69->34|70->35|71->36|71->36|71->36|73->38|73->38|73->38|73->38|74->39|75->40|77->42|77->42|77->42|77->42|78->43|82->47|82->47|83->48|84->49|84->49|85->50|86->51|86->51|87->52|88->53|88->53|89->54|92->57|92->57|92->57|93->58|94->59|94->59|94->59|95->60|95->60|95->60|95->60|96->61|97->62|105->70|105->70|106->71|107->72|107->72|108->73|111->76|111->76|111->76|112->77|112->77|112->77|112->77|112->77|112->77|112->77|112->77|113->78|114->79|119->84|119->84|120->85|133->98|133->98|133->98|168->133|168->133|168->133|169->134|170->135|170->135|170->135|171->136|172->137|174->139|176->141|176->141|176->141|177->142|177->142|177->142|177->142|177->142|177->142|177->142|178->143|178->143|178->143|179->144|179->144|179->144|179->144|179->144|179->144|179->144|180->145|182->147|187->152|187->152|187->152|187->152|187->152|187->152|188->153|188->153|188->153|188->153|188->153|188->153|193->158|193->158|193->158|193->158|193->158|193->158|198->163|198->163|198->163|198->163|198->163|198->163|205->170|205->170|205->170|206->171|207->172|207->172|207->172|208->173|209->174|212->177|246->211|246->211|246->211|246->211|248->213|248->213|248->213|249->214|250->215|253->218|256->221|256->221|256->221|256->221|256->221|256->221|262->227|262->227|262->227|262->227|263->228|263->228|263->228|263->228|263->228|263->228|264->229|264->229|264->229|264->229|264->229|264->229|265->230|265->230|265->230|266->231|266->231|266->231|266->231|266->231|266->231|266->231|267->232|267->232|267->232|267->232|267->232|267->232|268->233|269->234|273->238|273->238|273->238|273->238|274->239|274->239|274->239|274->239|274->239|274->239|275->240|275->240|275->240|276->241|276->241|276->241|276->241|276->241|276->241|276->241|277->242|279->244|288->253|288->253|288->253|288->253|288->253|288->253|301->266|301->266|301->266|302->267|303->268|304->269|307->272|309->274|310->275|310->275|310->275|311->276|312->277|313->278|314->279|316->281|318->283|319->284|320->285|321->286|322->287|323->288|324->289|325->290|326->291|327->292|328->293|329->294|330->295|336->301|336->301|336->301|337->302|337->302|337->302|337->302|338->303|340->305|344->309
                  -- GENERATED --
              */
          