/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

@file:Suppress("DuplicatedCode", "unused")

package org.jetbrains.kotlin.fir.expressions.impl

import org.jetbrains.kotlin.KtSourceElement
import org.jetbrains.kotlin.fir.FirImplementationDetail
import org.jetbrains.kotlin.fir.diagnostics.ConeDiagnostic
import org.jetbrains.kotlin.fir.expressions.FirAnnotation
import org.jetbrains.kotlin.fir.expressions.FirExpression
import org.jetbrains.kotlin.fir.expressions.FirPropertyAccessExpression
import org.jetbrains.kotlin.fir.references.FirReference
import org.jetbrains.kotlin.fir.types.ConeKotlinType
import org.jetbrains.kotlin.fir.types.FirTypeProjection
import org.jetbrains.kotlin.fir.visitors.*
import org.jetbrains.kotlin.fir.MutableOrEmptyList
import org.jetbrains.kotlin.fir.builder.toMutableOrEmpty
import org.jetbrains.kotlin.fir.expressions.UnresolvedExpressionTypeAccess

/*
 * This file was generated automatically
 * DO NOT MODIFY IT MANUALLY
 */

@OptIn(UnresolvedExpressionTypeAccess::class)
class FirPropertyAccessExpressionImpl @FirImplementationDetail constructor(
    @property:UnresolvedExpressionTypeAccess
    override var coneTypeOrNull: ConeKotlinType?,
    override var annotations: MutableOrEmptyList<FirAnnotation>,
    override var calleeReference: FirReference,
    override var contextReceiverArguments: MutableOrEmptyList<FirExpression>,
    override var typeArguments: MutableOrEmptyList<FirTypeProjection>,
    override var explicitReceiver: FirExpression?,
    override var dispatchReceiver: FirExpression?,
    override var extensionReceiver: FirExpression?,
    override var source: KtSourceElement?,
    override var nonFatalDiagnostics: MutableOrEmptyList<ConeDiagnostic>,
) : FirPropertyAccessExpression() {
    override fun <R, D> acceptChildren(visitor: FirVisitor<R, D>, data: D) {
        annotations.forEach { it.accept(visitor, data) }
        calleeReference.accept(visitor, data)
        contextReceiverArguments.forEach { it.accept(visitor, data) }
        typeArguments.forEach { it.accept(visitor, data) }
        explicitReceiver?.accept(visitor, data)
        if (dispatchReceiver !== explicitReceiver) {
            dispatchReceiver?.accept(visitor, data)
        }
        if (extensionReceiver !== explicitReceiver && extensionReceiver !== dispatchReceiver) {
            extensionReceiver?.accept(visitor, data)
        }
    }

    override fun <D> transformChildren(transformer: FirTransformer<D>, data: D): FirPropertyAccessExpressionImpl {
        transformAnnotations(transformer, data)
        transformCalleeReference(transformer, data)
        contextReceiverArguments.transformInplace(transformer, data)
        transformTypeArguments(transformer, data)
        explicitReceiver = explicitReceiver?.transform(transformer, data)
        if (dispatchReceiver !== explicitReceiver) {
            dispatchReceiver = dispatchReceiver?.transform(transformer, data)
        }
        if (extensionReceiver !== explicitReceiver && extensionReceiver !== dispatchReceiver) {
            extensionReceiver = extensionReceiver?.transform(transformer, data)
        }
        return this
    }

    override fun <D> transformAnnotations(transformer: FirTransformer<D>, data: D): FirPropertyAccessExpressionImpl {
        annotations.transformInplace(transformer, data)
        return this
    }

    override fun <D> transformCalleeReference(transformer: FirTransformer<D>, data: D): FirPropertyAccessExpressionImpl {
        calleeReference = calleeReference.transform(transformer, data)
        return this
    }

    override fun <D> transformTypeArguments(transformer: FirTransformer<D>, data: D): FirPropertyAccessExpressionImpl {
        typeArguments.transformInplace(transformer, data)
        return this
    }

    override fun <D> transformExplicitReceiver(transformer: FirTransformer<D>, data: D): FirPropertyAccessExpressionImpl {
        explicitReceiver = explicitReceiver?.transform(transformer, data)
        return this
    }

    override fun replaceConeTypeOrNull(newConeTypeOrNull: ConeKotlinType?) {
        coneTypeOrNull = newConeTypeOrNull
    }

    override fun replaceAnnotations(newAnnotations: List<FirAnnotation>) {
        annotations = newAnnotations.toMutableOrEmpty()
    }

    override fun replaceCalleeReference(newCalleeReference: FirReference) {
        calleeReference = newCalleeReference
    }

    override fun replaceContextReceiverArguments(newContextReceiverArguments: List<FirExpression>) {
        contextReceiverArguments = newContextReceiverArguments.toMutableOrEmpty()
    }

    override fun replaceTypeArguments(newTypeArguments: List<FirTypeProjection>) {
        typeArguments = newTypeArguments.toMutableOrEmpty()
    }

    override fun replaceExplicitReceiver(newExplicitReceiver: FirExpression?) {
        explicitReceiver = newExplicitReceiver
    }

    override fun replaceDispatchReceiver(newDispatchReceiver: FirExpression?) {
        dispatchReceiver = newDispatchReceiver
    }

    override fun replaceExtensionReceiver(newExtensionReceiver: FirExpression?) {
        extensionReceiver = newExtensionReceiver
    }

    @FirImplementationDetail
    override fun replaceSource(newSource: KtSourceElement?) {
        source = newSource
    }

    override fun replaceNonFatalDiagnostics(newNonFatalDiagnostics: List<ConeDiagnostic>) {
        nonFatalDiagnostics = newNonFatalDiagnostics.toMutableOrEmpty()
    }
}
