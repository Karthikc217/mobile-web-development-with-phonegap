/*******************************************************************************
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.jsdt.internal.oaametadata;

public class Mix extends DocumentedElement{
//	mix_element = element mix {
//		  mix_content  &  mix_attributes  &  foreign_nodes
//		}
//		mix_content = (
//		  descriptive_elements
//		  # Research the above, make consistent with the spec  
//		  # FIXME: aliases? ancestors?
//		)
//		mix_attributes = (
//		  datatype?  &  fromScope?  &  toScope?
//		)
		
	String datatype;
	String fromScope;
	String toScope; 
}
