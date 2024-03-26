package bug.test

import net.thauvin.erik.urlencoder.UrlEncoderUtil
import kotlin.test.Test

class NativeTests {
    @Test
    fun encodeUrl() {
        UrlEncoderUtil.encode("abc")
    }
    @Test
    fun decodeUrl() {
        UrlEncoderUtil.decode("abc")
    }
}