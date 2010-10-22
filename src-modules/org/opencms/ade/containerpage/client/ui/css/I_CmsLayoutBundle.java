/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/containerpage/client/ui/css/Attic/I_CmsLayoutBundle.java,v $
 * Date   : $Date: 2010/10/22 12:12:43 $
 * Version: $Revision: 1.15 $
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

package org.opencms.ade.containerpage.client.ui.css;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.Shared;

/**
 * Resource bundle to access CSS and image resources.
 * 
 * @author Tobias Herrmann
 * 
 * @version $Revision: 1.15 $
 * 
 * @since 8.0.0
 */
public interface I_CmsLayoutBundle extends org.opencms.gwt.client.ui.css.I_CmsImageBundle {

    /** Container-page CSS. */
    public interface I_CmsContainerpageCss
    extends org.opencms.gwt.client.ui.css.I_CmsToolbarButtonLayoutBundle.I_CmsToolbarButtonCss, I_CmsDragDropCss {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String clipboardDropzone();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String clipboardList();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String clipboardTabPanel();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String cms_ade_subcontainer();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String listCollectorEditor();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String menuContent();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String menuTabContainer();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String optionBar();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String showDropzone();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String subcontainerEditing();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String subcontainerEditor();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String subcontainerOverlay();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String subcontainerPlaceholder();

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String toolbarContext();
    }

    /** The content editor dialog CSS. */
    interface I_CmsContentEditorCss extends CssResource {

        /** Access method.<p>
         * 
         * @return the CSS class name
         */
        String contentEditor();
    }

    /** The drag and drop CSS classes used also within the container-page CSS. */
    @Shared
    public interface I_CmsDragDropCss extends org.opencms.gwt.client.ui.css.I_CmsLayoutBundle.I_CmsDragCss {

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragElement();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragging();

    }

    /** The drag and drop CSS classes. */
    public interface I_CmsDragDropExtendedCss extends I_CmsDragDropCss {

        /**
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String clearFix();

        /**
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String currentTarget();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragElementBackground();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragElementBorder();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragHandle();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragSubContainer();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String dragTarget();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String emptySubContainer();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String overlayShow();

        /** 
         * Access method.<p>
         * 
         * @return the CSS class name
         */
        String placeholderOverlay();

    }

    /** The bundle instance. */
    I_CmsLayoutBundle INSTANCE = GWT.create(I_CmsLayoutBundle.class);

    /**
     * Access method.<p>
     * 
     * @return the container-page CSS
     */
    @Source("containerpage.css")
    I_CmsContainerpageCss containerpageCss();

    /**
     * Access method.<p>
     * 
     * @return the content editor dialog CSS
     */
    @Source("contentEditor.css")
    @CssResource.NotStrict
    I_CmsContentEditorCss contentEditorCss();

    /**
     * Access method.<p>
     * 
     * @return the drag and drop CSS
     */
    @Source("dragdrop.css")
    I_CmsDragDropExtendedCss dragdropCss();
}
