package com.github.phillipsj.corf

import com.github.ajalt.clikt.core.*

fun main(args: Array<String>) = Manifest().subcommands(Create()).main(args)