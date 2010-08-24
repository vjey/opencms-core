/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/gwt/shared/rpc/Attic/I_CmsVfsService.java,v $
 * Date   : $Date: 2010/08/24 15:15:14 $
 * Version: $Revision: 1.1 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Management System
 *
 * Copyright (C) 2002 - 2009 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.gwt.shared.rpc;

import org.opencms.gwt.CmsRpcException;
import org.opencms.gwt.shared.CmsVfsEntryBean;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * A service interface for retrieving information about the VFS tree.<p>
 * 
 * @author Georg Westenberger
 * 
 * @version $Revision: 1.1 $
 * 
 * @since 8.0.0
 */
@RemoteServiceRelativePath("org.opencms.gwt.CmsVfsService.gwt")
public interface I_CmsVfsService extends RemoteService {

    /**
     * Fetches the list of children of a path.<p>
     * 
     * @param path the path for which the list of children should be retrieved
     *  
     * @return the children of the path 
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    List<CmsVfsEntryBean> getChildren(String path) throws CmsRpcException;

    /**
     * Returns the root entries of the VFS.<p>
     * 
     * @return a list of root entries
     * 
     * @throws CmsRpcException if something goes wrong 
     */
    List<CmsVfsEntryBean> getRootEntries() throws CmsRpcException;
}
