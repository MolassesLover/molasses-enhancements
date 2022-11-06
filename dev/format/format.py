# region Modules

import colorama
from colorama import Fore
import subprocess
import os
import sys

# endregion

# region Functions


def main():
    sourcePath: str = "../../"

    try:
        for root, dirs, files in os.walk(sourcePath):
            for file in files:
                if file.lower().endswith("json".lower()):
                    print(
                        f":: {Fore.BLUE}Formatting{Fore.RESET} {Fore.YELLOW}{file}{Fore.RESET} as {Fore.GREEN}JSON{Fore.RESET}"
                    )
                    try:
                        subprocess.check_output(
                            f"prettier --write {os.path.join(root, file)}",
                            shell=True,
                            stderr=subprocess.PIPE,
                        )
                    except subprocess.CalledProcessError as error:
                        print(f":: {Fore.RED}Error{Fore.RESET}:\n{error}")
                elif file.lower().endswith("py".lower()):
                    print(
                        f":: {Fore.BLUE}Formatting{Fore.RESET} {Fore.YELLOW}{file}{Fore.RESET} as {Fore.GREEN}Python{Fore.RESET}"
                    )
                    try:
                        subprocess.check_output(
                            f"black {os.path.join(root, file)}",
                            shell=True,
                            stderr=subprocess.PIPE,
                        )
                    except subprocess.CalledProcessError as error:
                        print(f":: {Fore.RED}Error{Fore.RESET}:\n{error}")
                elif file.lower().endswith("java".lower()):
                    print(
                        f":: {Fore.BLUE}Formatting{Fore.RESET} {Fore.YELLOW}{file}{Fore.RESET} as {Fore.GREEN}Java{Fore.RESET}"
                    )
                    try:
                        subprocess.check_output(
                            f"uncrustify -c ../../.uncrustify.config --no-backup --replace {os.path.join(root, file)}",
                            shell=True,
                            stderr=subprocess.PIPE,
                        )
                    except subprocess.CalledProcessError as error:
                        print(f":: {Fore.RED}Error{Fore.RESET}:\n{error}")

    # Ignore keyboard interruption
    except KeyboardInterrupt:
        sys.exit()


# endregion

if __name__ == "__main__":
    main()
