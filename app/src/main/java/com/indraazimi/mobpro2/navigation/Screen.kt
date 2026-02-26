/*
 * Copyright (c) 2026 Indra Azimi. All rights reserved.
 *
 * Dibuat untuk buku berjudul "Pemrograman Android Lanjut".
 * Dilarang melakukan penggandaan dan atau komersialisasi,
 * sebagian atau seluruh bagian, baik cetak maupun elektronik
 * terhadap project ini tanpa izin pemilik hak cipta.
 */

package com.indraazimi.mobpro2.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("MainScreen")

    data object Detail: Screen(
        "detailScreen/{$KEY_ID_KELAS}/{$KEY_NAMA_KELAS}"
    ) {
        fun withData(id: String, nama: String) = "detailScreen/$id/$nama"
    }
}