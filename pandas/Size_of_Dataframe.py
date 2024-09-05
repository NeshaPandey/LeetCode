import pandas as pd

def getDataframeSize(players: pd.DataFrame):
    rows = len(players)
    column = len(players.columns)
    return [rows,column]

players=pd.DataFrame({
    'A': [1, 2, 3],
    'B': [4, 5, 6],
    'C': [7, 8, 9]
})
getDataframeSize( players)