/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.parser.metamodel.procedure.impl;

import java.util.ArrayList;
import java.util.List;

import io.proleap.cobol.Cobol85Parser.OnSizeErrorPhraseContext;
import io.proleap.cobol.parser.metamodel.ProgramUnit;
import io.proleap.cobol.parser.metamodel.impl.CobolDivisionElementImpl;
import io.proleap.cobol.parser.metamodel.procedure.OnSizeErrorPhrase;
import io.proleap.cobol.parser.metamodel.procedure.Statement;

public class OnSizeErrorPhraseImpl extends CobolDivisionElementImpl implements OnSizeErrorPhrase {

	protected final OnSizeErrorPhraseContext ctx;

	protected List<Statement> statements = new ArrayList<Statement>();

	public OnSizeErrorPhraseImpl(final ProgramUnit programUnit, final OnSizeErrorPhraseContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public void addStatement(final Statement statement) {
		statements.add(statement);
	}

	@Override
	public List<Statement> getStatements() {
		return statements;
	}

}
