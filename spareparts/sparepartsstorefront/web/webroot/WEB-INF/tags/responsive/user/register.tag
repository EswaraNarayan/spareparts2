<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="actionNameKey" required="true"
	type="java.lang.String"%>
<%@ attribute name="action" required="true" type="java.lang.String"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="formElement"
	tagdir="/WEB-INF/tags/responsive/formElement"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<
<!-- style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

.saksham-custom {
	height: 100vh;
	width: 100vw;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	gap: 30px;
	background-color: rgb(231, 231, 231);
}

.skcontainer {
	height: 600px;
	width: 500px;
	background-color: white;
	box-shadow: 8px 8px 20px rgb(128, 128, 128);
	position: relative;
	overflow: hidden;
}

.skbtn {
	height: 60px;
	width: 300px;
	margin: 20px auto;
	box-shadow: 10px 10px 30px rgb(254, 215, 188);
	border-radius: 50px;
	display: flex;
	justify-content: space-around;
	align-items: center;
}

.sklogin, .sksignup {
	font-size: 22px;
	border: none;
	outline: none;
	background-color: transparent;
	position: relative;
	cursor: pointer;
}

.skslider {
	height: 60px;
	width: 150px;
	border-radius: 50px;
	background-image: linear-gradient(to right, rgb(255, 195, 110),
		rgb(255, 146, 91));
	position: absolute;
	top: 20px;
	left: 100px;
	transition: all 0.5s ease-in-out;
}

.skmoveslider {
	left: 250px;
}

.skform-section {
	height: 500px;
	width: 1000px;
	padding: 20px 0;
	display: flex;
	position: relative;
	transition: all 0.5s ease-in-out;
	left: 0px;
}

.skform-section-move {
	left: -500px;
}

.sklogin-box, .sksignup-box {
	height: 100%;
	width: 500px;
	display: flex;
	flex-direction: column;
	align-items: center;
	justify-content: center;
	padding: 0px 40px;
}

.sklogin-box {
	gap: 50px;
}

.sksignup-box {
	gap: 30px;
}

.skele {
	height: 60px;
	width: 400px;
	outline: none;
	border: none;
	color: rgb(77, 77, 77);
	background-color: rgb(240, 240, 240);
	border-radius: 50px;
	padding-left: 30px;
	font-size: 18px;
}

.skclkbtn {
	height: 60px;
	width: 150px;
	border-radius: 50px;
	background-image: linear-gradient(to right, rgb(255, 195, 110),
		rgb(255, 146, 91));
	font-size: 22px;
	border: none;
	cursor: pointer;
}

/* For Responsiveness of the page */
@media screen and (max-width: 650px) {
	.skcontainer {
		height: 600px;
		width: 300px;
	}
	.skbtn {
		height: 50px;
		width: 200px;
		margin: 20px auto;
	}
	.sklogin, .sksignup {
		font-size: 19px;
	}
	.skslider {
		height: 50px;
		width: 100px;
		left: 50px;
	}
	.skmoveslider {
		left: 150px;
	}
	.skform-section {
		height: 500px;
		width: 600px;
	}
	.skform-section-move {
		left: -300px;
	}
	.sklogin-box, .sksignup-box {
		height: 100%;
		width: 300px;
	}
	.skele {
		height: 50px;
		width: 250px;
		font-size: 15px;
	}
	.skclkbtn {
		height: 50px;
		width: 130px;
		font-size: 19px;
	}
}

@media screen and (max-width: 320px) {
	.skcontainer {
		height: 600px;
		width: 250px;
	}
	.skbtn {
		height: 50px;
		width: 200px;
		margin: 20px auto;
	}
	.sklogin, .sksignup {
		font-size: 19px;
	}
	.skslider {
		height: 50px;
		width: 100px;
		left: 27px;
	}
	.skmoveslider {
		left: 127px;
	}
	.skform-section {
		height: 500px;
		width: 500px;
	}
	.skform-section-move {
		left: -250px;
	}
	.sklogin-box, .sksignup-box {
		height: 100%;
		width: 250px;
	}
	.skele {
		height: 50px;
		width: 220px;
		font-size: 15px;
	}
	.skclkbtn {
		height: 50px;
		width: 130px;
		font-size: 19px;
	}
}
</style-->
<spring:htmlEscape defaultHtmlEscape="true" />

<spring:url value="/login/register/termsandconditions"
	var="getTermsAndConditionsUrl" />

<div class="user-register__headline">
	<spring:theme code="register.new.customer" />
</div>
<p>
	<spring:theme code="register.description" />
</p>

<form:form method="post" modelAttribute="sparepartRegisterForm"
	action="${action}"
	style="
	width: 70%;
    padding-top: 20px;
    padding-left: 50px;">
	<formElement:formSelectBoxDefaultEnabled idKey="register.title"
		labelKey="register.title" selectCSSClass="form-control"
		path="titleCode" mandatory="true" skipBlank="false"
		skipBlankMessageKey="form.select.none" items="${titles}" />
	<formElement:formInputBox idKey="register.firstName"
		labelKey="register.firstName" path="firstName" inputCSS="form-control"
		mandatory="true" />
	<formElement:formInputBox idKey="register.lastName"
		labelKey="register.lastName" path="lastName" inputCSS="form-control"
		mandatory="true" />
	<formElement:formInputBox idKey="register.mobileNumber"
		labelKey="register.mobileNumber" path="mobileNumber" inputCSS="form-control"
		mandatory="true" />
	<formElement:formInputBox idKey="register.email"
		labelKey="register.email" path="email" inputCSS="form-control"
		mandatory="true" />
	<formElement:formPasswordBox idKey="password" labelKey="register.pwd"
		path="pwd" inputCSS="form-control password-strength" mandatory="true" />
	<formElement:formPasswordBox idKey="register.checkPwd"
		labelKey="register.checkPwd" path="checkPwd" inputCSS="form-control"
		mandatory="true" />

	<c:if test="${ not empty consentTemplateData }">
		<form:hidden path="consentForm.consentTemplateId"
			value="${consentTemplateData.id}" />
		<form:hidden path="consentForm.consentTemplateVersion"
			value="${consentTemplateData.version}" />
		<div class="checkbox">
			<label class="control-label uncased"> <form:checkbox
					path="consentForm.consentGiven" disabled="true" /> <c:out
					value="${consentTemplateData.description}" />

			</label>
		</div>
		<div class="help-block">
			<spring:theme code="registration.consent.link" />
		</div>

	</c:if>

	<spring:theme code="register.termsConditions"
		arguments="${getTermsAndConditionsUrl}" var="termsConditionsHtml"
		htmlEscape="false" />
	<template:errorSpanField path="termsCheck">
		<div class="checkbox">
			<label class="control-label uncased"> <form:checkbox
					id="registerChkTermsConditions" path="termsCheck" disabled="true" />
				${ycommerce:sanitizeHTML(termsConditionsHtml)}
			</label>
		</div>
	</template:errorSpanField>

	<input type="hidden" id="recaptchaChallangeAnswered"
		value="${fn:escapeXml(requestScope.recaptchaChallangeAnswered)}" />
	<div
		class="form_field-elements control-group js-recaptcha-captchaaddon"></div>
	<div class="form-actions clearfix">
		<ycommerce:testId code="register_Register_button">
			<button type="submit" class="btn btn-default btn-block"
				disabled="disabled">
				<spring:theme code='${actionNameKey}' />
			</button>
		</ycommerce:testId>
	</div>
</form:form>
