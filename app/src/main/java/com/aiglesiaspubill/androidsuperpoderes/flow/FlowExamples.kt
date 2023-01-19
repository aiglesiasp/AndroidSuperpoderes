package com.aiglesiaspubill.androidsuperpoderes.flow


import android.util.Log
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

    class FlowExamples {

        suspend fun flowExampleWithAsFlow() {
            val intList = listOf(1, 3, 5, 5467, 6878, 54)
            val stringList = listOf("1", "3", "5", "5467", "6878", "54")
            val mixList = listOf(1, "3", "5", "5467", "6878", "54")

            val initFlow = intList.asFlow()
            val stringFlow = stringList.asFlow()
            val mixFlow = mixList.asFlow()
        }

        suspend fun flowExampleWithFlowOf() {
            val initFlow = flowOf(1, 3, 5, 5467, 6878, 54)
            val stringFlow = flowOf("1", "3", "5", "5467", "6878", "54")
            val mixFlow = flowOf(1, "3", "5", "5467", "6878", "54")
        }

        suspend fun flowExampleWithFlow() {
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
            }

            val stringFlow = flow<String> {
                emit("1")
                emit("3")
                emit("5")
                emit("5467")
                emit("6878")
                emit("54")
            }

            val mixFlow = flow {
                emit("1")
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
            }
        }

        suspend fun flowExampleWithOnEach() {
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
            }

            val intFlow2 = intFlow.onEach {
                var a = it
                Log.d("FLOW", a.toString())
                a *= 10
                Log.d("FLOW2", a.toString())
            }

            intFlow2.collect {
                Log.d("COMPOSE_FLOW", it.toString())
            }

        }

        suspend fun flowExampleWithMap() {
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
            }

            val intFlow2 = intFlow.map { it ->
                it * 10
            }

            intFlow2.collect {
                Log.d("COMPOSE_FLOW", it.toString())
            }

        }

        suspend fun flowExampleWithMapAndOnEach() {
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
            }.onEach {
                Log.d("COMPOSE_FLOW_1", it.toString())
            }.map { it ->
                it * 10
            }.onEach {
                Log.d("COMPOSE_FLOW_2", it.toString())
            }.collect {
                Log.d("COMPOSE_FLOW_3", it.toString())
            }

        }

        suspend fun flowExampleWithFilter() {
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
                emit(5)
            }.filter { it > 6 }
                .collect {
                    Log.d("COMPOSE_FLOW_3", it.toString())
                }

        }

        suspend fun flowExampleWithTrasform() {
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
                emit(5)
            }.transform {
                emit(it)
                emit("Número $it")
            }.collect {

                when(it){
                    is Int -> {
                        Log.d("COMPOSE_FLOW_3", "Entero numero $it")

                    }
                    is String -> {
                        Log.d("COMPOSE_FLOW_3", "String numero $it")
                    }
                }
            }

        }

        suspend fun flowExampleWithTake() {
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
                emit(5)
            }.take(1).collect {
                Log.d("COMPOSE_FLOW_3", it.toString())
            }
        }

        suspend fun flowExampleWithToList() {
            Log.d("FLOW", "INIT")
            val intFlow = flow {
                emit(1)
                delay(1000)
                emit(3)
                delay(1000)
                emit(5)
                delay(1000)
                emit(5467)
                delay(1000)
                emit(6878)
                delay(1000)
                emit(54)
                delay(1000)
                emit(5)
            }.toList()

            Log.d("FLOW", intFlow.toString())
        }

        suspend fun flowExampleWithToSet() {
            Log.d("FLOW", "INIT")
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
                emit(5)
            }.toSet()

            Log.d("FLOW", intFlow.toString())
        }


        suspend fun flowExampleWithFirst() {
            Log.d("FLOW", "INIT")
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
                emit(5)
            }.first()

            Log.d("FLOW", intFlow.toString())
        }

        suspend fun flowExampleWithReduce() {
            Log.d("FLOW", "INIT")
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
                emit(5)
            }.reduce{ accumulator, value ->
                accumulator + value
            }

            Log.d("FLOW", intFlow.toString())
        }

        suspend fun flowExampleWithReduce2() {
            Log.d("FLOW", "INIT")
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
                emit(5)
            }.map { "$it" }.reduce{ accumulator, value ->
                accumulator + value
            }

            Log.d("FLOW", intFlow)
        }

        suspend fun flowExampleWithFold() {
            Log.d("FLOW", "INIT")
            val intFlow = flow {
                emit(1)
                emit(3)
                emit(5)
                emit(5467)
                emit(6878)
                emit(54)
                emit(5)
            }.map { "$it" }.fold("Hola "){ accumulator, value ->
                accumulator + value
            }

            Log.d("FLOW", intFlow)
        }
    }