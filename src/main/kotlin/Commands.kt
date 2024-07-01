package com.github.phillipsj.corf

import com.github.ajalt.clikt.core.*

class Manifest: CliktCommand() {
    override fun run() = Unit
}

class Create: CliktCommand(help="Creates a manifest for S3 Batch Operations") {
    override fun run() {
        echo("Manifest create.")
    }
}