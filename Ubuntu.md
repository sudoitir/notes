### KDE su not accepting root or user password

```
echo '[super-user-command]
super-user-command=su' | sudo tee -a /usr/bin/software-properties-kde
```

```
echo '[super-user-command]
super-user-command=su' | sudo tee -a ~/.kde/share/config/kdesurc
```
