# Fast Install - Fresh Ununtu

```
sudo apt update && sudo apt upgrade -y && sudo apt autoremove && sudo apt install fonts-firacode tmux neofetch duf htop
bashtop mpv ubuntu-restricted-extras ffmpeg zsh -y
```

### spotdl

```
pip install spotdl
```

### Beekeeper Studio

#### Install our GPG key
```wget --quiet -O - https://deb.beekeeperstudio.io/beekeeper.key | sudo apt-key add -```

#### add our repo to your apt lists directory
```echo "deb https://deb.beekeeperstudio.io stable main" | sudo tee /etc/apt/sources.list.d/beekeeper-studio-app.list```

#### Update apt and install
```sudo apt update```

```sudo apt install beekeeper-studio```
