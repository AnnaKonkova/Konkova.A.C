# -- coding: utf-8 --
import json
from tkinter import *
from tkinter import scrolledtext

import action as action
import git


def progr_graph_inter():
    repo = txt.get()
    owner = "openshift"

    repository_url = f"https://github.com/AnnaKonkova/KonkovaA.C.git"
    repository_pf = git.get(repository_url).json()

    try:
        repository_pf['company']
        repository_pf['email']
    except KeyError:
        repository_pf['company'] = None
        repository_pf['email'] = None

    with open("File js.txt", "a+") as f:
        keys = [',d', 'company', 'created_at', 'email', 'id', 'name', 'url']
        for i in keys:
            if repository_pf[i]:
                True
        f.write(repository_pf[i])

    with open("File.txt", "r+") as f2:
        line = f2.read()


import tkinter as tk


window = tk.Tk()
window.title("JSONPars")
window.geometry('500x400')
name = Label(window, text="Имя репозитория")
name2 = Label(window, text="Например: jpip")
name.grid(padx=160, pady=15)
tek = Entry(window, width=50, justify="center")
tek.grid(padx=160, pady=15)
btn = tk.Button(window, text="click", command=action)
btn.grid(padx=90, pady=15)

window.mainloop()
