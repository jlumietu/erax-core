/**
 * 
 */
package com.erax.principal;

/**
 * @author jlumietu
 *
 */
public abstract class AbstractPrincipalSerializableIdLocatorAware implements PrincipalSerializableIdLocatorAware {

	private PrincipalSerializableIdLocator principalSerializableIdLocator;

	/* (non-Javadoc)
	 * @see com.erax.principal.PrincipalSerializableIdLocatorAware#getPrincipalSerializableIdLocator()
	 */
	@Override
	public PrincipalSerializableIdLocator getPrincipalSerializableIdLocator() {
		return principalSerializableIdLocator;
	}

	/**
	 * @param principalSerializableIdLocator
	 */
	public AbstractPrincipalSerializableIdLocatorAware(PrincipalSerializableIdLocator principalSerializableIdLocator) {
		super();
		this.principalSerializableIdLocator = principalSerializableIdLocator;
	}	
	
	public PrincipalSerializableId getPrincipalSerializableId(){
		return this.getPrincipalSerializableIdLocator().findPrincipalSerializableId();
	}
	
}
