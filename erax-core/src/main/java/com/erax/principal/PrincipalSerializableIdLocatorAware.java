package com.erax.principal;

/**
 * 
 * @author jlumietu
 *
 */
public interface PrincipalSerializableIdLocatorAware {

	/**
	 * @return the principalSerializableIdLocator
	 */
	public abstract PrincipalSerializableIdLocator getPrincipalSerializableIdLocator();
	
	/**
	 * 
	 * @return
	 */
	public abstract PrincipalSerializableId getPrincipalSerializableId();

}