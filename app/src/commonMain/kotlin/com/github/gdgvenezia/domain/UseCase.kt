package com.github.gdgvenezia.domain

interface UseCase<T, U> {

    fun execute(params: T) : Result<U>
}
