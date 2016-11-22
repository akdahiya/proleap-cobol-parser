/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.procedure.add;

import io.proleap.cobol.parser.metamodel.procedure.Statement;
import io.proleap.cobol.parser.metamodel.valuestmt.ValueStmt;

public interface AddCorresponding extends Statement {

	ValueStmt getFromValueStmt();

	To getTo();

	void setFromValueStmt(ValueStmt fromValueStmt);

	void setTo(To to);

}
