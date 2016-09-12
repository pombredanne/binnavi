// Copyright 2011-2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

#include <iostream>

void printStartMessage()
{
	std::cout << "BinNavi debug client for Linux32 applications" << std::endl;
	std::cout << "Build date: " << __TIME__ << " " << __DATE__ << std::endl;
	std::cout << std::endl;
}

char szUsage[] = {
"=============================================================================\n"
" Usage: For regular, user-mode Linux debugging type:\n "
"	 clientl32 [PID|PATH] [PORT] [OPTIONS]\n"
"    [  PID ]    Process ID or name of the process to attach to\n"
"    [ PATH ]    Path to the executable\n"
"    [ PORT ]    TCP Port to bind to for communication (default is 2222)\n"
"    [ OPTIONS ] One of ...\n"
"                   -v              Verbose mode \n"
"                   -vv             Very verbose mode \n"
"                   -lf filename    Filename of the logfile\n"
"=============================================================================\n"
};
