define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Adonis|AngularJS|BPEL|BPMN|JBPM|JSF|List|Modelio|String|UML|Yoaqiang|action|actor|address|and|android|annotation|annotations|as|associatedEntities|attribute|author|baseColor|basepath|behavior|birthday|blank|boolean|bounds|business|businessModel|button|callToAction|callactivity|calling|cancel|case|catch|checkBoxGruppe|choreography|clicks|collaboration|commons|compensation|complex|conditional|continousIntegration|customIds|dataModel|database|databases|datasources|datatype|default|deutsch|diagram|do|docker|documentation|eMail|ear|edge|element|else|enables|english|enters|entity|enumeration|envVariables|environment|error|escalation|event|eventbased|exclude|exclusive|expanded|extends|extension|false|feature|finally|flow|focuses|fontSize|for|framework|from|gateway|given|globals|group|groups|h2|height|highLightColor|horizontal|html2|idType|if|import|inclusive|infrastructure|initializing|inputField|instanceof|into|issueManagement|java|javaType|jdkVersion|jvm|label|lane|language|languages|layout|link|listView|loggerName|loggerType|lumen|management|matlab|merge|message|mongoDb|multiple|mySql|name|namespace|nestedParentProject|new|null|opens|option|oracleDb|organization|organizations|outputText|package|packageName|parallel|parent|persistence|persistenceUnit|person|persons|php|plane|pool|prefix|primaryKey|process|project|projects|properties|radioButtonGroup|relationship|rest|restClient|restGenerator|restService|return|role|roles|runtime|scenario|selects|shape|should|signal|soap|soapClient|soapService|sourceCodeManagement|specification|specifications|stakeholders|static|structure|style|styling|subprocess|suffix|super|swift|switch|synchronized|task|terminate|testCases|testMethods|testing|textColor|then|throw|timer|titelBar|to|transferobjects|transition|triggerAction|true|try|type|typeof|ui|upload|useSpringMVC|val|value|values|valuesFromAction|var|version|view|waypoint|webProject|webservices|when|while|width|x|xor|y";
		this.$rules = {
			"start": [
				{token: "comment", regex: "\\/\\/.*$"},
				{token: "comment", regex: "\\/\\*", next : "comment"},
				{token: "string", regex: '["](?:(?:\\\\.)|(?:[^"\\\\]))*?["]'},
				{token: "string", regex: "['](?:(?:\\\\.)|(?:[^'\\\\]))*?[']"},
				{token: "constant.numeric", regex: "[+-]?\\d+(?:(?:\\.\\d*)?(?:[eE][+-]?\\d+)?)?\\b"},
				{token: "constant.numeric", regex: "0[xX][0-9a-fA-F]+\\b"},
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			],
			"comment": [
				{token: "comment", regex: ".*?\\*\\/", next : "start"},
				{token: "comment", regex: ".+"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/stubb";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
