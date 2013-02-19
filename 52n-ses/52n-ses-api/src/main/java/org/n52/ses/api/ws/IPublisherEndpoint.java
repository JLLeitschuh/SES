/**
 * Copyright (C) 2012
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * This program is free software; you can redistribute and/or modify it under
 * the terms of the GNU General Public License version 2 as published by the
 * Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program (see gnu-gpl v2.txt). If not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or
 * visit the Free Software Foundation web page, http://www.fsf.org.
 */
// 
// IMyCapability.java
// Wed May 21 14:00:09 CEST 2008
// Generated by the Apache Muse Code Generation Tool
// 
package org.n52.ses.api.ws;

import org.apache.muse.ws.addressing.EndpointReference;
import org.apache.muse.ws.addressing.soap.SoapFault;
import org.w3c.dom.Element;

/**
 * Interface for the renew registration method
 *
 */
public interface IPublisherEndpoint {
	
	/**
	 * standard prefix for XML QNames
	 */
    String PREFIX = "tns";

    /**
     * namespace for the renew registration operation name
     */
    String NAMESPACE_URI = "http://docs.oasis-open.org/wsn/br-2";

    /**
     * renews a registration
     * @param TerminationTime the new termination time
     * @return XML response
     * @throws Exception if an error occurred on renewing
     */
    public Element renewRegistration(Element TerminationTime) throws Exception;

	public EndpointReference getPublisherReference();

	public String getSensorId() throws SoapFault;

	public Element getSensorML();

	public void reRegister();

}