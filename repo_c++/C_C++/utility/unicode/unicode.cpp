
//PARA PODER COLOCAR CARACTERIS ESPECIAIS

#include <iostream>
#include <fcntl.h>  
#include <io.h>

int main()

{

	_setmode(_fileno(stdout), _O_U16TEXT);
	std::wcout << "palavra" << L"\u263A" << std::endl; /*ex; (r) de registrado*/
	/*wcout- para caractere grande */
	system("PAUSE");

}