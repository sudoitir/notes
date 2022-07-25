## install

'''sudo apt install zsh'''
'''sh -c "$(curl -fsSL https://raw.github.com/ohmyzsh/ohmyzsh/master/tools/install.sh)"'''

## Plugins

'''git clone https://github.com/zsh-users/zsh-syntax-highlighting.git ${ZSH_CUSTOM:-~
/.oh-my-zsh/custom}/plugins/zsh-syntax-highlighting'''

'''git clone https://github.com/zsh-users/zsh-autosuggestions ${ZSH_CUSTOM:-~
/.oh-my-zsh/custom}/plugins/zsh-autosuggestions'''

### Configuring zsh

'''nano ~/.zshrc'''

plugins=(
git
zsh-autosuggestions
zsh-syntax-highlighting
tmux
sudo
ubuntu
)

## Theme

'''git clone https://github.com/spaceship-prompt/spaceship-prompt.git "$ZSH_CUSTOM/themes/spaceship-prompt" --depth=1'''

'''ln -s "$ZSH_CUSTOM/themes/spaceship-prompt/spaceship.zsh-theme" "$ZSH_CUSTOM/themes/spaceship.zsh-theme"'''

Set '''ZSH_THEME="spaceship"''' in your '''.zshrc'''.