from googleapiclient.discovery import build
import env_vars

DEVELOPER_KEY = env_vars.youtube_api_key
YOUTUBE_API_SERVICE_NAME = 'youtube'
YOUTUBE_API_VERSION = 'v3'


def youtube_search(query_term):
    youtube = build(YOUTUBE_API_SERVICE_NAME, YOUTUBE_API_VERSION,
                    developerKey=DEVELOPER_KEY)

    # Call the search.list method to retrieve results matching the specified
    # query term.
    search_response = youtube.search().list(
        q=query_term,
        part='id,snippet',
        maxResults=1
    ).execute()

    try:
        return search_response['items'][0]['id']['videoId']
    except IndexError:
        return None
