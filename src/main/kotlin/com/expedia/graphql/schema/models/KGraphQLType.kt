package com.expedia.graphql.schema.models

import graphql.schema.GraphQLType
import kotlin.reflect.KClass

/**
 * Container for the types cache information.
 */
internal data class KGraphQLType(val kClass: KClass<*>, val graphQLType: GraphQLType)
