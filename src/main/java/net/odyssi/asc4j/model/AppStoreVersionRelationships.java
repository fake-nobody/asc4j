/*
 * App Store Connect API
 * Automate the tasks you perform on the Apple Developer website and in App Store Connect.  The App Store Connect API is a REST API that enables the automation of actions you take in App Store Connect.  Calls to the API require JSON Web Tokens (JWT) for authorization; you obtain keys to create the tokens from your organization’s App Store Connect account.
 *
 * The version of the OpenAPI document: 1.2
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.odyssi.asc4j.model;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AppStoreVersionRelationships
 */
@JsonPropertyOrder({ AppStoreVersionRelationships.JSON_PROPERTY_APP,
		AppStoreVersionRelationships.JSON_PROPERTY_AGE_RATING_DECLARATION,
		AppStoreVersionRelationships.JSON_PROPERTY_APP_STORE_VERSION_LOCALIZATIONS,
		AppStoreVersionRelationships.JSON_PROPERTY_BUILD,
		AppStoreVersionRelationships.JSON_PROPERTY_APP_STORE_VERSION_PHASED_RELEASE,
		AppStoreVersionRelationships.JSON_PROPERTY_ROUTING_APP_COVERAGE,
		AppStoreVersionRelationships.JSON_PROPERTY_APP_STORE_REVIEW_DETAIL,
		AppStoreVersionRelationships.JSON_PROPERTY_APP_STORE_VERSION_SUBMISSION,
		AppStoreVersionRelationships.JSON_PROPERTY_IDFA_DECLARATION })

public class AppStoreVersionRelationships implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = -4370765586231150700L;

	public static final String JSON_PROPERTY_AGE_RATING_DECLARATION = "ageRatingDeclaration";

	public static final String JSON_PROPERTY_APP = "app";
	public static final String JSON_PROPERTY_APP_STORE_REVIEW_DETAIL = "appStoreReviewDetail";

	public static final String JSON_PROPERTY_APP_STORE_VERSION_LOCALIZATIONS = "appStoreVersionLocalizations";
	public static final String JSON_PROPERTY_APP_STORE_VERSION_PHASED_RELEASE = "appStoreVersionPhasedRelease";

	public static final String JSON_PROPERTY_APP_STORE_VERSION_SUBMISSION = "appStoreVersionSubmission";
	public static final String JSON_PROPERTY_BUILD = "build";

	public static final String JSON_PROPERTY_IDFA_DECLARATION = "idfaDeclaration";
	public static final String JSON_PROPERTY_ROUTING_APP_COVERAGE = "routingAppCoverage";

	private AppStoreVersionRelationshipsAgeRatingDeclaration ageRatingDeclaration;

	private AppEncryptionDeclarationRelationshipsApp app;
	private AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail;

	private AppStoreVersionRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations;
	private AppStoreVersionRelationshipsAppStoreVersionPhasedRelease appStoreVersionPhasedRelease;

	private AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionSubmission;
	private AppStoreVersionRelationshipsBuild build;

	private AppStoreVersionRelationshipsIdfaDeclaration idfaDeclaration;
	private AppStoreVersionRelationshipsRoutingAppCoverage routingAppCoverage;

	public AppStoreVersionRelationships ageRatingDeclaration(
			AppStoreVersionRelationshipsAgeRatingDeclaration ageRatingDeclaration) {

		this.ageRatingDeclaration = ageRatingDeclaration;
		return this;
	}

	public AppStoreVersionRelationships app(AppEncryptionDeclarationRelationshipsApp app) {

		this.app = app;
		return this;
	}

	public AppStoreVersionRelationships appStoreReviewDetail(
			AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail) {

		this.appStoreReviewDetail = appStoreReviewDetail;
		return this;
	}

	public AppStoreVersionRelationships appStoreVersionLocalizations(
			AppStoreVersionRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations) {

		this.appStoreVersionLocalizations = appStoreVersionLocalizations;
		return this;
	}

	public AppStoreVersionRelationships appStoreVersionPhasedRelease(
			AppStoreVersionRelationshipsAppStoreVersionPhasedRelease appStoreVersionPhasedRelease) {

		this.appStoreVersionPhasedRelease = appStoreVersionPhasedRelease;
		return this;
	}

	public AppStoreVersionRelationships appStoreVersionSubmission(
			AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionSubmission) {

		this.appStoreVersionSubmission = appStoreVersionSubmission;
		return this;
	}

	public AppStoreVersionRelationships build(AppStoreVersionRelationshipsBuild build) {

		this.build = build;
		return this;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AppStoreVersionRelationships appStoreVersionRelationships = (AppStoreVersionRelationships) o;
		return Objects.equals(this.app, appStoreVersionRelationships.app)
				&& Objects.equals(this.ageRatingDeclaration, appStoreVersionRelationships.ageRatingDeclaration)
				&& Objects.equals(this.appStoreVersionLocalizations,
						appStoreVersionRelationships.appStoreVersionLocalizations)
				&& Objects.equals(this.build, appStoreVersionRelationships.build)
				&& Objects.equals(this.appStoreVersionPhasedRelease,
						appStoreVersionRelationships.appStoreVersionPhasedRelease)
				&& Objects.equals(this.routingAppCoverage, appStoreVersionRelationships.routingAppCoverage)
				&& Objects.equals(this.appStoreReviewDetail, appStoreVersionRelationships.appStoreReviewDetail)
				&& Objects.equals(this.appStoreVersionSubmission,
						appStoreVersionRelationships.appStoreVersionSubmission)
				&& Objects.equals(this.idfaDeclaration, appStoreVersionRelationships.idfaDeclaration);
	}

	/**
	 * Get ageRatingDeclaration
	 *
	 * @return ageRatingDeclaration
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_AGE_RATING_DECLARATION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreVersionRelationshipsAgeRatingDeclaration getAgeRatingDeclaration() {
		return this.ageRatingDeclaration;
	}

	/**
	 * Get app
	 *
	 * @return app
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppEncryptionDeclarationRelationshipsApp getApp() {
		return this.app;
	}

	/**
	 * Get appStoreReviewDetail
	 *
	 * @return appStoreReviewDetail
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP_STORE_REVIEW_DETAIL)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail getAppStoreReviewDetail() {
		return this.appStoreReviewDetail;
	}

	/**
	 * Get appStoreVersionLocalizations
	 *
	 * @return appStoreVersionLocalizations
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_LOCALIZATIONS)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreVersionRelationshipsAppStoreVersionLocalizations getAppStoreVersionLocalizations() {
		return this.appStoreVersionLocalizations;
	}

	/**
	 * Get appStoreVersionPhasedRelease
	 *
	 * @return appStoreVersionPhasedRelease
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_PHASED_RELEASE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreVersionRelationshipsAppStoreVersionPhasedRelease getAppStoreVersionPhasedRelease() {
		return this.appStoreVersionPhasedRelease;
	}

	/**
	 * Get appStoreVersionSubmission
	 *
	 * @return appStoreVersionSubmission
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_APP_STORE_VERSION_SUBMISSION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreVersionRelationshipsAppStoreVersionSubmission getAppStoreVersionSubmission() {
		return this.appStoreVersionSubmission;
	}

	/**
	 * Get build
	 *
	 * @return build
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_BUILD)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreVersionRelationshipsBuild getBuild() {
		return this.build;
	}

	/**
	 * Get idfaDeclaration
	 *
	 * @return idfaDeclaration
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_IDFA_DECLARATION)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreVersionRelationshipsIdfaDeclaration getIdfaDeclaration() {
		return this.idfaDeclaration;
	}

	/**
	 * Get routingAppCoverage
	 *
	 * @return routingAppCoverage
	 **/

	@Valid

	@JsonProperty(JSON_PROPERTY_ROUTING_APP_COVERAGE)
	@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

	public AppStoreVersionRelationshipsRoutingAppCoverage getRoutingAppCoverage() {
		return this.routingAppCoverage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.app, this.ageRatingDeclaration, this.appStoreVersionLocalizations, this.build,
				this.appStoreVersionPhasedRelease, this.routingAppCoverage, this.appStoreReviewDetail,
				this.appStoreVersionSubmission, this.idfaDeclaration);
	}

	public AppStoreVersionRelationships idfaDeclaration(AppStoreVersionRelationshipsIdfaDeclaration idfaDeclaration) {

		this.idfaDeclaration = idfaDeclaration;
		return this;
	}

	public AppStoreVersionRelationships routingAppCoverage(
			AppStoreVersionRelationshipsRoutingAppCoverage routingAppCoverage) {

		this.routingAppCoverage = routingAppCoverage;
		return this;
	}

	public void setAgeRatingDeclaration(AppStoreVersionRelationshipsAgeRatingDeclaration ageRatingDeclaration) {
		this.ageRatingDeclaration = ageRatingDeclaration;
	}

	public void setApp(AppEncryptionDeclarationRelationshipsApp app) {
		this.app = app;
	}

	public void setAppStoreReviewDetail(
			AppStoreReviewAttachmentRelationshipsAppStoreReviewDetail appStoreReviewDetail) {
		this.appStoreReviewDetail = appStoreReviewDetail;
	}

	public void setAppStoreVersionLocalizations(
			AppStoreVersionRelationshipsAppStoreVersionLocalizations appStoreVersionLocalizations) {
		this.appStoreVersionLocalizations = appStoreVersionLocalizations;
	}

	public void setAppStoreVersionPhasedRelease(
			AppStoreVersionRelationshipsAppStoreVersionPhasedRelease appStoreVersionPhasedRelease) {
		this.appStoreVersionPhasedRelease = appStoreVersionPhasedRelease;
	}

	public void setAppStoreVersionSubmission(
			AppStoreVersionRelationshipsAppStoreVersionSubmission appStoreVersionSubmission) {
		this.appStoreVersionSubmission = appStoreVersionSubmission;
	}

	public void setBuild(AppStoreVersionRelationshipsBuild build) {
		this.build = build;
	}

	public void setIdfaDeclaration(AppStoreVersionRelationshipsIdfaDeclaration idfaDeclaration) {
		this.idfaDeclaration = idfaDeclaration;
	}

	public void setRoutingAppCoverage(AppStoreVersionRelationshipsRoutingAppCoverage routingAppCoverage) {
		this.routingAppCoverage = routingAppCoverage;
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AppStoreVersionRelationships {\n");
		sb.append("    app: ").append(toIndentedString(this.app)).append("\n");
		sb.append("    ageRatingDeclaration: ").append(toIndentedString(this.ageRatingDeclaration)).append("\n");
		sb.append("    appStoreVersionLocalizations: ").append(toIndentedString(this.appStoreVersionLocalizations))
				.append("\n");
		sb.append("    build: ").append(toIndentedString(this.build)).append("\n");
		sb.append("    appStoreVersionPhasedRelease: ").append(toIndentedString(this.appStoreVersionPhasedRelease))
				.append("\n");
		sb.append("    routingAppCoverage: ").append(toIndentedString(this.routingAppCoverage)).append("\n");
		sb.append("    appStoreReviewDetail: ").append(toIndentedString(this.appStoreReviewDetail)).append("\n");
		sb.append("    appStoreVersionSubmission: ").append(toIndentedString(this.appStoreVersionSubmission))
				.append("\n");
		sb.append("    idfaDeclaration: ").append(toIndentedString(this.idfaDeclaration)).append("\n");
		sb.append("}");
		return sb.toString();
	}

}