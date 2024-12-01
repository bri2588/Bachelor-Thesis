/**
 * This file is part of veraPDF Validation, a module of the veraPDF project.
 * Copyright (c) 2015-2024, veraPDF Consortium <info@verapdf.org>
 * All rights reserved.
 *
 * veraPDF Validation is free software: you can redistribute it and/or modify
 * it under the terms of either:
 *
 * The GNU General public license GPLv3+.
 * You should have received a copy of the GNU General Public License
 * along with veraPDF Validation as the LICENSE.GPL file in the root of the source
 * tree.  If not, see http://www.gnu.org/licenses/ or
 * https://www.gnu.org/licenses/gpl-3.0.en.html.
 *
 * The Mozilla Public License MPLv2+.
 * You should have received a copy of the Mozilla Public License along with
 * veraPDF Validation as the LICENSE.MPL file in the root of the source tree.
 * If a copy of the MPL was not distributed with this file, you can obtain one at
 * http://mozilla.org/MPL/2.0/.
 */
package org.verapdf.gf.model.impl.pd.images;

import org.verapdf.gf.model.impl.pd.util.PDResourcesHandler;
import org.verapdf.model.baselayer.Object;
import org.verapdf.model.pdlayer.PDMaskImage;
import org.verapdf.pd.images.PDXImage;

import java.util.Collections;
import java.util.List;

/**
 * @author Maxim Plushchov
 */
public class GFPDMaskImage extends GFPDXImage implements PDMaskImage {

	public static final String MASK_IMAGE_TYPE = "PDMaskImage";

	public GFPDMaskImage(PDXImage simplePDObject, PDResourcesHandler resourcesHandler) {
		super(simplePDObject, resourcesHandler, null, MASK_IMAGE_TYPE);
	}

	@Override
	public List<? extends Object> getLinkedObjects(String link) {
		switch (link) {
			case INTENT:
			case IMAGE_CS:
			case MASK:
				return Collections.emptyList();
			default:
				return super.getLinkedObjects(link);
		}
	}

	@Override
	public Boolean getisMask() {
		return true;
	}

}