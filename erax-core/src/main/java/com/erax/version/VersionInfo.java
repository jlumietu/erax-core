package com.erax.version;

public interface VersionInfo {
	
	public static final String DEFAULT_LIBRARY_VERSION_PROPERTY_NAME = "library.version";
	public static final String DEFAULT_LIBRARY_NAME_PROPERTY_NAME = "library.name";

	/**
	 * @return the artifactName
	 */
	String getArtifactName();

	/**
	 * @param artifactName the artifactName to set
	 */
	void setArtifactName(String artifactName);

	/**
	 * @return the artifactVersion
	 */
	String getArtifactVersion();

	/**
	 * @param artifactVersion the artifactVersion to set
	 */
	void setArtifactVersion(String artifactVersion);

}