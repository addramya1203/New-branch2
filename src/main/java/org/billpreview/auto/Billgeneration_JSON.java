package org.billpreview.auto;

import org.json.simple.JSONObject;

public class Billgeneration_JSON {
	EligibilityAPI eli_repsone;
	String requestID = eli_repsone.requestId;

	public JSONObject BillGenarationJson() {
		JSONObject requestParams2 = new JSONObject();
		requestParams2.put("invoiceAccountNumber", "8310000984924");
		requestParams2.put("attuid", "ra8586");
		requestParams2.put("vmmsUsageInd", "N");
		requestParams2.put("bbgwUsageInd", "Y");
		requestParams2.put("requestedDate", "20190223000004");
		requestParams2.put("requestId", requestID);
		requestParams2.put("actionCode", "C");
		return requestParams2;

	}
}
