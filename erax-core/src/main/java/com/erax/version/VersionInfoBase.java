/**
 * 
 */
package com.erax.version;

import java.io.Serializable;

import com.erax.EraxCoreApplicationVersion;

/**
 * @author DOIBALMI
 *
 */
public class VersionInfoBase implements Serializable, VersionInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = EraxCoreApplicationVersion.LIBRARY_VERSION;
	
	private String artifactName;
	
	private String artifactVersion;
	
	/**
	 * 
	 * @param artifactName
	 * @param artifactVersion
	 */
	public VersionInfoBase(String artifactName, String artifactVersion) {
		super();
		this.artifactName = artifactName;
		this.artifactVersion = artifactVersion;
	}

	/**
	 * 
	 */
	public VersionInfoBase() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.erax.version.VersionInfo#getArtifactName()
	 */
	public String getArtifactName() {
		return artifactName;
	}

	/* (non-Javadoc)
	 * @see com.erax.version.VersionInfo#setArtifactName(java.lang.String)
	 */
	public void setArtifactName(String artifactName) {
		this.artifactName = artifactName;
	}

	/* (non-Javadoc)
	 * @see com.erax.version.VersionInfo#getArtifactVersion()
	 */
	public String getArtifactVersion() {
		return artifactVersion;
	}

	/* (non-Javadoc)
	 * @see com.erax.version.VersionInfo#setArtifactVersion(java.lang.String)
	 */
	public void setArtifactVersion(String artifactVersion) {
		this.artifactVersion = artifactVersion;
	}
	
	

}
