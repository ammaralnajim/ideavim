/*
 * IdeaVim - Vim emulator for IDEs based on the IntelliJ platform
 * Copyright (C) 2003-2014 The IdeaVim authors
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

/**
 * IdeaVim command index.
 *
 *
 * 1. Insert mode
 *
 * tag                      action
 * ---------------------------------------------------------------------------------------------------------------------
 *
 * |i_<Esc>|                {@link com.maddyhome.idea.vim.action.change.insert.InsertExitModeAction}
 * |i_CTRL-[|
 * |i_CTRL-C|
 * |i_CTRL-\_CTRL-N|
 *
 *
 * 2. Normal mode
 *
 * tag                      action
 * ---------------------------------------------------------------------------------------------------------------------
 *
 * |i|                      {@link com.maddyhome.idea.vim.action.change.insert.InsertBeforeCursorAction}
 * |<Insert>|
 * |v|                      {@link com.maddyhome.idea.vim.action.motion.visual.VisualToggleCharacterModeAction}
 *
 *
 * 5. Ex commands
 *
 * tag                      handler
 * ---------------------------------------------------------------------------------------------------------------------
 *
 * |:map|                   {@link com.maddyhome.idea.vim.ex.handler.MapHandler}
 * |:nmap|
 * |:vmap|
 * |:omap|
 * |:imap|
 * |:cmap|
 * |:noremap|
 * |:nnoremap|
 * |:vnoremap|
 * |:onoremap|
 * |:inoremap|
 * |:cnoremap|
 * |:sort|                  {@link com.maddyhome.idea.vim.ex.handler.SortHandler}
 * |:source|                {@link com.maddyhome.idea.vim.ex.handler.SourceHandler}
 *
 * @see :help index.
 *
 * @author vlan
 */
package com.maddyhome.idea.vim;
