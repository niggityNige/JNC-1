/*    -*- Java -*-
 *
 *  Copyright 2007 Tail-F Systems AB. All rights reserved.
 *
 *  This software is the confidential and proprietary
 *  information of Tail-F Systems AB.
 *
 *  $Id$
 *
 */

package com.tailf.confm.xs;
import com.tailf.confm.*;
import java.io.Serializable;

/**
 * This class implements the "xs:NMTOKEN" datatype from
 * the 'http://www.w3.org/2001/XMLSchema' namespace.
 *
 * Derivate from "xs:token".
 */
public class NMTOKEN extends Token implements Serializable {

    public NMTOKEN(java.lang.String value) throws ConfMException {
        super(value);
        check();
    }

    /**
     * Sets the value.
     */
    public void setValue(java.lang.String value) throws ConfMException {
        super.setValue(value);
        check();
    }

    private void check() throws ConfMException {
        // no spaces or commas allowed
        noSpacesOrCommasAllowed( getValue() );
    }


}
