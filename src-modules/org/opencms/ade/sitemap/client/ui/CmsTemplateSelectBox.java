/*
 * File   : $Source: /alkacon/cvs/opencms/src-modules/org/opencms/ade/sitemap/client/ui/Attic/CmsTemplateSelectBox.java,v $
 * Date   : $Date: 2010/08/24 15:15:14 $
 * Version: $Revision: 1.3 $
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

package org.opencms.ade.sitemap.client.ui;

import org.opencms.gwt.client.ui.input.A_CmsSelectBox;
import org.opencms.gwt.client.ui.input.form.CmsFormDialog;

/**
 * A widget class for selecting a template for a sitemap entry in the sitemap editor.<p>
 * 
 * @author Georg Westenberger
 * 
 * @version $Revision: 1.3 $
 * 
 * @since 8.0.0
 * 
 */
public class CmsTemplateSelectBox extends A_CmsSelectBox<CmsTemplateSelectCell> {

    /** Width to which the title label should be truncated. */
    private static final int TRUNCATION_WIDTH = 250;

    /** The select cell which is used as the widget contained in the opener.<p> */
    CmsTemplateSelectCell m_openerWidget;

    /**
     * Default constructor.<p>
     */
    public CmsTemplateSelectBox() {

        super();

    }

    /**
     * @see com.google.gwt.user.client.ui.Widget#onLoad()
     */
    @Override
    public void onLoad() {

        truncate("TEMPLATE_SELECT", TRUNCATION_WIDTH);
    }

    /**
     * @see org.opencms.gwt.client.ui.input.I_CmsFormWidget#onOpenDialog(org.opencms.gwt.client.ui.input.form.CmsFormDialog)
     */
    public void onOpenDialog(CmsFormDialog formDialog) {

        // do nothing
    }

    /**
     * @see org.opencms.gwt.client.ui.input.A_CmsSelectBox#truncateOpener(java.lang.String, int)
     */
    @Override
    public void truncateOpener(String prefix, int width) {

        m_openerWidget.truncate(prefix + "_OPENER", TRUNCATION_WIDTH);
    }

    /**
     * @see org.opencms.gwt.client.ui.input.A_CmsSelectBox#initOpener()
     */
    @Override
    protected void initOpener() {

        m_openerWidget = new CmsTemplateSelectCell();
        m_opener.add(m_openerWidget);
    }

    /**
     * @see org.opencms.gwt.client.ui.input.A_CmsSelectBox#updateOpener(java.lang.String)
     */
    @Override
    protected void updateOpener(String newValue) {

        CmsTemplateSelectCell selectCell = m_selectCells.get(newValue);
        CmsTemplateSelectCell opener = m_openerWidget;
        opener.setTemplate(selectCell.getTemplate());

    }
}
