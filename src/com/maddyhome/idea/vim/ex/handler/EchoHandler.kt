/*
 * IdeaVim - Vim emulator for IDEs based on the IntelliJ platform
 * Copyright (C) 2003-2016 The IdeaVim authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.maddyhome.idea.vim.ex.handler

import com.intellij.openapi.actionSystem.DataContext
import com.intellij.openapi.editor.Editor
import com.maddyhome.idea.vim.ex.*
import com.maddyhome.idea.vim.ex.vimscript.VimScriptGlobalEnvironment
import com.maddyhome.idea.vim.ex.vimscript.VimScriptParser

/**
 * @author vlan
 */
class EchoHandler : CommandHandler(
        commands { +"ec" withOptional "ho" },
        flags(CommandHandler.RANGE_FORBIDDEN, CommandHandler.ARGUMENT_OPTIONAL)
) {

    override fun execute(editor: Editor, context: DataContext,
                         cmd: ExCommand): Boolean {
        val env = VimScriptGlobalEnvironment.getInstance()
        val globals = env.variables
        val value = VimScriptParser.evaluate(cmd.argument, globals)
        val text = VimScriptParser.expressionToString(value) + "\n"
        ExOutputModel.getInstance(editor).output(text)
        return true
    }
}
