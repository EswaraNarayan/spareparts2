<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<div class="tabhead">
	<a href="">${fn:escapeXml(title)}</a> <span class="glyphicon"></span>
</div>
<div class="tabbody">
	<div class="container-lg">
		<div class="row">
			<div class="col-md-6 col-lg-4">
				<div class="tab-container">
					
					<div style="margin-top:10px" class="description">Compatibility: ${product.compatibility}</div>
					<div style="margin-top:10px" class="description">Weight: ${product.weight}</div>
					<div style="margin-top:10px" class="description">Condition: ${product.condition}</div>
					<div style="margin-top:10px" class="description">Brand Name: ${product.brandName}</div>
					<div style="margin-top:10px" class="description">Vehicle Model: ${product.vehicleModel}</div>
					<div style="margin-top:10px" class="description">Model Year: ${product.modelYear}</div>	
					<div style="margin-top:10px" class="description">Country Of Origin: ${product.countryOfOrigin}</div>
				</div>
			</div>
		</div>
	</div>
</div>

