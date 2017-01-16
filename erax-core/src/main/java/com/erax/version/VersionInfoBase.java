/**
 * 
 */
package com.erax.version;

import java.io.Serializable;
import java.util.Properties;

import com.erax.EraxCoreApplicationVersion;

/**
 * @author jlumietu - Mikel Ibiricu Alfaro
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
	
	public VersionInfoBase(Properties properties){
		this(properties, DEFAULT_LIBRARY_NAME_PROPERTY_NAME, DEFAULT_LIBRARY_VERSION_PROPERTY_NAME);
	}
	
	public VersionInfoBase(Properties properties, String libraryNameProperty, String libraryVersionProperty){
		super();
		this.artifactName = properties.getProperty(libraryNameProperty);
		this.artifactVersion = properties.getProperty(libraryVersionProperty);
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
