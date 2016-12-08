/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.cobol.asg.metamodel.data.communication.impl;

import java.util.ArrayList;
import java.util.List;

import io.proleap.cobol.Cobol85Parser.DestinationTableClauseContext;
import io.proleap.cobol.asg.metamodel.IntegerLiteral;
import io.proleap.cobol.asg.metamodel.ProgramUnit;
import io.proleap.cobol.asg.metamodel.call.Call;
import io.proleap.cobol.asg.metamodel.data.communication.DestinationTableClause;
import io.proleap.cobol.asg.metamodel.impl.CobolDivisionElementImpl;

public class DestinationTableClauseImpl extends CobolDivisionElementImpl implements DestinationTableClause {

	protected DestinationTableClauseContext ctx;

	protected List<Call> indexCalls = new ArrayList<Call>();

	protected IntegerLiteral occursIntegerLiteral;

	public DestinationTableClauseImpl(final ProgramUnit programUnit, final DestinationTableClauseContext ctx) {
		super(programUnit, ctx);

		this.ctx = ctx;
	}

	@Override
	public void addIndexCall(final Call indexCall) {
		indexCalls.add(indexCall);
	}

	@Override
	public List<Call> getIndexCalls() {
		return indexCalls;
	}

	@Override
	public IntegerLiteral getOccursIntegerLiteral() {
		return occursIntegerLiteral;
	}

	@Override
	public void setIntegerLiteral(final IntegerLiteral occursIntegerLiteral) {
		this.occursIntegerLiteral = occursIntegerLiteral;
	}

}