<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/responsive/cart" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags" %>



<spring:htmlEscape defaultHtmlEscape="true" />

<template:page pageTitle="${pageTitle}">

	<cart:cartValidation/>
	<cart:cartPickupValidation/>

	<div class="cart-top-bar">
        <div class="text-right">
            <spring:theme var="textHelpHtml" code="text.help" />
            <a href="" class="help js-cart-help" style="
    color: black;
    font-style: oblique;
"
 data-help="${fn:escapeXml(textHelpHtml)}">${textHelpHtml}
                <span class="glyphicon glyphicon-info-sign" style="
    font-size: x-large;
    color: #40647e;
" ></span>
            </a>
            <div class="help-popup-content-holder js-help-popup-content">
                <div class="help-popup-content">
                    <strong>${fn:escapeXml(cartData.code)}</strong>
                    <spring:theme var="cartHelpContentVar" code="basket.page.cartHelpContent" htmlEscape="false" />
                    <c:set var="cartHelpContentVarSanitized" value="${ycommerce:sanitizeHTML(cartHelpContentVar)}" />
                    <div>${cartHelpContentVarSanitized}</div>
                </div>
            </div>
		</div>
	</div>
                       <h1  style="
    background-color: whitesmoke;
    font-style: italic;
" >   Special Instructions : </h1>
                       <p> ~ If the product arrives damaged, kindly include a return label for the return process.</p>
                                 

    <style>

        body {

            font-family: sans-serif;

            font-size: 14px;

            margin: 0;

            padding: 0;

        }

       </style>
	<div>
		<div>
            <cms:pageSlot position="TopContent" var="feature">
                <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
            </cms:pageSlot>
		</div>

	   <c:if test="${not empty cartData.rootGroups}">
           <cms:pageSlot position="CenterLeftContentSlot" var="feature">
                <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
           </cms:pageSlot>
        </c:if>
		
		 <c:if test="${not empty cartData.rootGroups}">
            <cms:pageSlot position="CenterRightContentSlot" var="feature">
                <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
            </cms:pageSlot>
            <cms:pageSlot position="BottomContentSlot" var="feature">
                <cms:component component="${feature}" element="div" class="yComponentWrapper"/>
            </cms:pageSlot>
		</c:if>
				
		<c:if test="${empty cartData.rootGroups}">
            <cms:pageSlot position="EmptyCartMiddleContent" var="feature">
                <cms:component component="${feature}" element="div" class="yComponentWrapper content__empty"/>
            </cms:pageSlot>
		</c:if>
	</div>
</template:page>
