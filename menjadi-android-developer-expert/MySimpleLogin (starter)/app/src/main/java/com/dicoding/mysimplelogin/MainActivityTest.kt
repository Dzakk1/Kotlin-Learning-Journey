package com.dicoding.mysimplelogin

import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.koin.core.context.loadKoinModules
import org.koin.core.context.stopKoin

//class MainActivityTest : KoinTest{
//
//    private val userRepository: UserRepository by inject()
//    private val username = "dicoding"
//
//    @Before
//    fun before() {
//        loadKoinModules(storageModule)
//        userRepository.loginUser(username)
//    }
//
//    @After
//    fun after() {
//        stopKoin()
//    }
//
//    @Test
//    fun getUsernameFromRepository() {
//        val requestedUsername = userRepository.getUser()
//        assertEquals("Welcome $username", requestedUsername)
//    }
//}