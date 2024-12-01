/**
 * This file is part of veraPDF WCAG Validation, a module of the veraPDF project.
 * Copyright (c) 2015-2024, veraPDF Consortium <info@verapdf.org>
 * All rights reserved.
 *
 * veraPDF WCAG Validation is free software: you can redistribute it and/or modify
 * it under the terms of either:
 *
 * The GNU General public license GPLv3+.
 * You should have received a copy of the GNU General Public License
 * along with veraPDF WCAG Validation as the LICENSE.GPL file in the root of the source
 * tree.  If not, see http://www.gnu.org/licenses/ or
 * https://www.gnu.org/licenses/gpl-3.0.en.html.
 *
 * The Mozilla Public License MPLv2+.
 * You should have received a copy of the Mozilla Public License along with
 * veraPDF WCAG Validation as the LICENSE.MPL file in the root of the source tree.
 * If a copy of the MPL was not distributed with this file, you can obtain one at
 * http://mozilla.org/MPL/2.0/.
 */
package org.verapdf.gf.model.impl.sa.structelems;

import org.verapdf.gf.model.impl.sa.GFSAStructElem;
import org.verapdf.model.salayer.SAReference;
import org.verapdf.pd.structure.PDStructElem;
import org.verapdf.tools.TaggedPDFConstants;

public class GFSAReference extends GFSAStructElem implements SAReference {

    public static final String REFERENCE_STRUCTURE_ELEMENT_TYPE = "SAReference";

    public GFSAReference(PDStructElem structElemDictionary, String parentsStandardTypes) {
        super(structElemDictionary, TaggedPDFConstants.REFERENCE, REFERENCE_STRUCTURE_ELEMENT_TYPE,
              parentsStandardTypes);
    }
}