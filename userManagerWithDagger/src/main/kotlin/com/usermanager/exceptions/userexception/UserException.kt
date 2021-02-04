package com.usermanager.exceptions.userexception

import java.lang.RuntimeException

open class UserException(override val message: String): RuntimeException(message)  {

}