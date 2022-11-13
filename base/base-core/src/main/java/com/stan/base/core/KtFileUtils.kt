package com.stan.base.core

import java.io.File

/**
 * Author: stan
 * Date: 2022/11/12
 * Description: 文件处理工具类
 */
class KtFileUtils {

    companion object {

        fun writeBytes(file: File?): Boolean {
            if (file == null || file.exists().not()) {
                return false
            }
            return true
        }
    }
}